package my.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author marshal
 * @Date 9/11/20 11:18 AM
 */
public class ReflectionTomTest {

    public static void main(String[] args) throws Exception{

        // 1.1 获取Tom的Class对象
        Class<Tom> clz = Tom.class;
        // 1.2 创建Tom类的实例
        Constructor<Tom> constructor = clz.getDeclaredConstructor(null);
        Tom tom = constructor.newInstance();

        // 2. 操作Tom的Filed

//        System.out.println(tom.name);

        tom.name = "Tom2";
        // 3. 操作Tom的Function
        Method f1 = clz.getDeclaredMethod("f2", String.class);
        Object result = f1.invoke(tom, "12345");
        System.out.println(result);


    }
}
