package Day3;

import java.util.ArrayList;

public class StackCaller {

	public StackCaller() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		StackwithArray stack = new StackwithArray(1);
		stack.push(2);
		stack.push(3);
		
		ArrayList<Object> ar =new ArrayList<>();
		ar.add("String");
		ar.add(2);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
	}
}

