package Day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Vector;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
//		Vector<Integer> v = new Vector<Integer>();
//		v.add(2);
//		v.add(4);
//		v.add(5);
//		System.out.println(v);
//		
		
		Employee e1 = new Employee(1,"Monica",34300000);
		Employee e2 = new Employee(4,"Joey",454000);
		Employee e3 = new Employee(2,"Ross",3443000);
		Employee e4 = new Employee(10,"Chandler",3434000);
		ArrayList<Employee> ar = new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		
		System.out.println(ar);
		
		Collections.sort(ar, new EmpSalary());
		System.out.println(ar);
		
		Collections.sort(ar, new EmpName());
		System.out.println(ar);
		
		for(Employee e:ar) {
			if(e.getEmpName().equals("Joey"))
				e.setSalary(e.salary+100000);
		}
		
		System.out.println(ar);
		
		Properties p = new Properties();
		
		try {
			FileReader fr = new FileReader("src/my.properties");
			p.load(fr);
			
			System.out.println(p.getProperty("name"));
			System.out.println(p.getProperty("city"));
			System.out.println(p.getProperty("phone"));
			
			fr.close();
		} catch (FileNotFoundException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		} catch (IOException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
		finally {
			
		}
		
	}
}
