package my.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/8/20 9:47 PM
 */
public class ReflectionTest2 {
    public static void main(String[] args) throws Exception{
        Girl lili = new Girl(20, "Lili");
        Class<? extends Girl> g = lili.getClass();
        Field name = g.getDeclaredField("name");
        System.out.println(name.getName());;
//        System.out.println(name.getType());
//        System.out.println(name.getType() == String.class);
//        System.out.println(name.get(lili));
//        System.out.println(name.get(lili).getClass());

        String methodName = toGetMethod(name.getName());
        Method method = g.getDeclaredMethod(methodName);
        System.out.println(method.invoke(lili).getClass());
//        System.out.println(method.invoke(null));


        System.out.println("Hello,".substring(0,5));
        System.out.println("Hello,".length());
    }

    private static String toGetMethod(String fieldName) {
        return "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
    }
}
