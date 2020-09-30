package my.demo;

import java.lang.reflect.Field;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/8/20 9:43 PM
 */
public class SqlTest {

    public static void main(String[] args) throws Exception {

        Book book = new Book();
        book.setId(1);
        book.setBookName("Java Test");
        book.setAuthor("Tom");

        insert(book);
        // insert into book(id,book_name,author) values(1,'Java Test','Tom')

        query(book);
        //select * from book where 1 = 1 and id = 1 and book_name = 'Java Test' and author = 'Tom'

    }

    private static void query(Book book) throws Exception {
        Class<Book> c = Book.class;
        // 拼接数据库名
        Table table = c.getAnnotation(Table.class);
        StringBuilder sql = new StringBuilder("select * from " + table.value() + " where 1 = 1");
        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {
            Column column = f.getAnnotation(Column.class);
            Object result = c.getDeclaredMethod(toGetMethod(f.getName())).invoke(book);
            if (result != null) {
                // 判断Column注解是否有值
                if (column.value().length() != 0) {
                    if (f.getType() == String.class) {
                        // 如果是String类型，需要加上单引String号
                        sql.append(" and " + column.value() + " = '" + result + "'");
                    } else {
                        sql.append(" and " + column.value() + " = " + result);
                    }
                } else {
                    if (f.getType() == String.class) {
                        // 如果是String类型，需要加上单引号
                        sql.append(" and " + f.getName() + " = '" + result + "'");
                    } else {
                        sql.append(" and " + f.getName() + " = " + result);
                    }
                }
            }
        }
        System.out.println(sql);
    }

    public static void insert(Book book) throws Exception {
        Class<Book> c = Book.class;
        // 拼接数据库名
        Table table = c.getAnnotation(Table.class);
        StringBuilder sql = new StringBuilder("insert into " + table.value() + "(");
        Field[] fields = c.getDeclaredFields();
        StringBuilder sqlValue = new StringBuilder("values(");
        for (Field f : fields) {
            Column column = f.getAnnotation(Column.class);
            Object result = c.getDeclaredMethod(toGetMethod(f.getName())).invoke(book);
            if (result != null) {
                // 判断Column注解是否有值
                if (column.value().length() != 0) {
                    sql.append(column.value() + ",");
                    if (f.getType() == String.class) {
                        sqlValue.append("'" + result + "',");
                    } else {
                        sqlValue.append(result + ",");
                    }
                } else {
                    sql.append(f.getName() + "," );
                    if (f.getType() == String.class) {
                        sqlValue.append("'" + result + "',");
                    } else {
                        sqlValue.append(result + ",");
                    }
                }
            }
        }
        String a = sql.toString().substring(0, sql.length() - 1);
        String b = sqlValue.toString().substring(0, sqlValue.length() - 1);
        System.out.println(a + ") " + b + ")");
    }

    private static String toGetMethod(String fieldName) {
        return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }


}
