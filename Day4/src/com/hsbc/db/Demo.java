package com.hsbc.db;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

import com.hsbc.Generics_Practice.Employee;

public class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			//REFLECTION API
			Class c = Class.forName("com.hsbc.Generics_Practice.Employee");
			//Employee e = (Employee) Class.forName("com.hsbc.Generics_Practice.Employee").newInstance();
			
			Method m[] = c.getDeclaredMethods();
			for(int i=0; i<m.length;i++) {
				//System.out.println(m[i].getName());
			}	
				
			Field f[] = c.getDeclaredFields();
			for(int i=0; i<f.length;i++) {
				System.out.println(f[i].getName());
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
