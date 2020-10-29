import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Class c = Class.forName("Employee");

        Method[] methods = c.getDeclaredMethods();
        System.out.println("=== Methods ===");
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Field[] fields = c.getDeclaredFields();
        System.out.println("=== Fields ===");
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
