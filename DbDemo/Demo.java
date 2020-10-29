package DbDemo;

import java.lang.reflect.*;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try {
			//Reflection API
			Class c = Class.forName("Day4.Employee");
			
			Method m[]=c.getDeclaredMethods();
			for(int i=0;i<m.length;i++)
				System.out.println(m[i].getName());
			System.out.println("");
			
			Field f[]=c.getDeclaredFields();
			for(int i=0;i<f.length;i++)
				System.out.println(f[i].getName());
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
