package practicestring;

import java.util.HashMap;

public class Strings {
	public static void main(String[] args) {
		String s1 =" hello world how are you where are you what is your name how is your car";
		String ar[] = s1.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String s: ar)
			hm.put(s.toLowerCase(), hm.getOrDefault(s.toLowerCase(), 0)+1);
		
		for(String s:hm.keySet())
			System.out.println(s+" "+hm.get(s));
	}

}
