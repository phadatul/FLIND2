package Day3;

import java.io.IOException;
import java.util.HashMap;

public class StringsAndException {
	static {
		
	}
	public StringsAndException() {
		// TODO Auto-generated constructor stub
	}
	public static void hello(){
		int age = 19;
		if(age>18 && age<35) {
			System.out.println("Admission Cool");
		}
		else
			throw new InvalidAgeException();
	}
	public static void main(String[] args) throws IOException{
		
		hello();
		
//		String s = new String("Hello world");
//		String s1 = "Hello world";
//		s=(s.charAt(0)+"").toUpperCase()+s.substring(1);
//		System.out.println(s);

//		String s1 ="helllo world how are you where are you what is your name how is you car";
//		String ar[] = s1.split(" ");
//		HashMap<String,Integer> hm = new HashMap<>();
//		
//		for(String s:ar)
//			hm.put(s.toLowerCase(), hm.getOrDefault(s.toLowerCase(), 0)+1);
//		
//		for(String s:hm.keySet())
//			System.out.println(s+" "+hm.get(s));

		String s = null;

		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("End of Program");

		Throwable t = new Throwable();// superclass of error and exception class
		
		try {
			ArrayIndexOutOfBoundsException a = new ArrayIndexOutOfBoundsException("Length not sufficient");
			throw a;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		
		
	}

}
