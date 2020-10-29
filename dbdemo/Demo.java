package com.hsbc.dbdemo;

import com.hsbc.Employee;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class c = Class.forName("com.hsbc.Employee");
			
			Method m[]= c.getDeclaredMethods();
			for(int i=0; i<m.length; i++) {
				System.out.println(m[i].getName());
			}
			
			Field f[]= c.getDeclaredFields();
			for(int i=0; i<f.length; i++) {
				System.out.println(f[i].getName());
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
