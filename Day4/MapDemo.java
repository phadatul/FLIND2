import java.io.*;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "ABC");
        map.put(2, "PQR");
        map.put(3, "ZYX");
        map.put(1, "PPP");
        System.out.println(map);

        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader("my.properties");
            properties.load(reader);

            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("phone"));
            System.out.println(properties.getProperty("zipcode"));

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
