package practicestring;

public class Demo {
	public static void main(String[] args) {
//		String s = new String("Hello World");
//		String s1 = "Hello World";
//		
//		System.out.println(s);
//		System.out.println(s.length());
//		System.out.println(s.charAt(6));
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.replace("o", "*"));
//		System.out.println(s.replaceFirst("o", "*"));
//		System.out.println(s.substring(0,3));
		
		
		String s = "hello world";// String literal pool - memory area - special place = you can't mutate it
		System.out.println(s);
		s.toUpperCase();
		s.concat(" bye bye");
		System.out.println(s.toUpperCase());
		System.out.println(s);
		// once you create string in java, you can't modify it.
		// every time you perform any operation in java, you end up creating new strings
		StringBuffer sb = new StringBuffer("hello world");
		System.out.println(sb+"hi");
		System.out.println(sb);
		sb.append(" bye bye");
		System.out.println(sb);
		
		
		
	}

}
