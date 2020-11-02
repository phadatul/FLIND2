package Day2;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int addfunction(int a[])
	{
		int val = 0;
		for(int i =0; i<a.length; i++)
		{
			val = val+ a[i];
		}
		
		return val;
	}
	
	public void hello() {
		System.out.println("Hello World");
	}
	
	int add(int a, int b) {
		System.out.println("int");
		return a+b;
	}
	
	int add(byte a, byte b) {
		System.out.println("byter in parameters");
		return a+b;
	}
	
	int add(short a, short b) {
		System.out.println("short in parameters");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println("long");
		return a+b;
	}
	
	double add(double a, double b){
		System.out.println("double");
		return a+b;
	}
	
	float add(float a, float b){
		System.out.println("float");
		return a+b;
	}
	
	
	

}
