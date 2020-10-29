import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class DemoMap {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1,  "ABC");
		map.put(2,  "CDE");
		map.put(3,  "EFG");
		System.out.println(map);
		Properties p = new Properties();
		try {
			FileReader fr = new FileReader("my.properties");
			p.load(fr);
			System.out.println(p.getProperty("name"));
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
