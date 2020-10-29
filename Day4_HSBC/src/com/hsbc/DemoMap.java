package com.hsbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map= new HashMap();
		
		
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(3, "XYZ");
		map.put(4, "ABC");
		
		System.out.println(map);
		
		Properties p = new Properties();
		
		try {
			FileReader fr = new FileReader("my.properties");
			
			p.load(fr);
			
			System.out.println(p.getProperty("name"));
			System.out.println(p.getProperty("phone"));
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
