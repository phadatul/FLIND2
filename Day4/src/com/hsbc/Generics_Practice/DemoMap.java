package com.hsbc.Generics_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class DemoMap {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(1, "Alexis");
		map.put(2, "Ted");
		map.put(3, "Mutt");
		map.put(3, "Stavros");
		
		System.out.println(map);
		
		Properties p = new Properties();
		try {
			FileReader fr = new FileReader("my.properties");
			p.load(fr);
			System.out.println(p.getProperty("city"));
			
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		}

}
