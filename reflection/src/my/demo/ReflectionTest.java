package my.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/8/20 9:04 PM
 */
public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        // 1. 获取Girl类的Class对象
        Class<Girl> c = Girl.class;
        /*===============================  操作函数  =====================================*/
        System.out.println("================= method ==================");
        // 2. 获取Girl类的双参数函构造器
        Constructor<Girl> constructor = c.getDeclaredConstructor(int.class, String.class);
        // 3. 通过构造函数实例化
        Girl alice = constructor.newInstance(18, "Alice");
        System.out.println(alice);  // Girl{age=18, name='Alice'}

        // 4. 操作getAge()函数
        Method getAge = c.getDeclaredMethod("getAge", null);
        Object invoke = getAge.invoke(alice, null);
        System.out.println(invoke); // 18  （返回值）

        // 5. 操作setName() 函数
        Method setName = c.getDeclaredMethod("setName", String.class);
        Object luna = setName.invoke(alice, "Luna");
        System.out.println(luna);       // null  （无返回值）
        System.out.println(alice);      // Girl{age=18, name='Luna'} （成功修改了name的值）

        // 6. 操作setAge()函数
        Method setAge = c.getDeclaredMethod("setAge", int.class);
        Object result = setAge.invoke(alice, 22);
        System.out.println(alice);      // Girl{age=22, name='Luna'}  (成功修改了age的值)


        /*===============================  操作字段  =====================================*/
        System.out.println("================= field ==================");
        Field nation = c.getDeclaredField("nation");
        System.out.println(nation.get(alice));
        nation.set(alice, "Japan");
        System.out.println(alice);

        // 操作私有变量会报错
        //java.lang.IllegalAccessException:
        //class com.my.reflection.ReflectionTest cannot access a member of class com.my.reflection.Girl with modifiers "private"
//        c.getDeclaredField("birthday").set(alice, "2006-01-01");


    }

}
