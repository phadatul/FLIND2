package hsbc.stackpractice;

import java.util.ArrayList;

public class MyStack<Q> { //GENERIC

	ArrayList a1= new ArrayList();
	
	/*public void push( data) {
		
		a1.add(data);
	}
	
	public int pop() {
		
		int a= (int) a1.remove(a1.size()-1);
		return 0;
	}
	
	public void print() {
		
		System.out.println(a1);
	}*/
	
	public void push(Q data) {
		
		a1.add(data);
	
	}
	
	public Q pop() {
		
		Q a= (Q) a1.remove(a1.size()-1);
		return a;
	
	}
	
	public void print() {
		
		System.out.println(a1);
	
	}
}
