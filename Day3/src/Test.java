
public class Test {
	public static void main(String[] args) {
	
		int a=5;
		int b=5;
		System.out.println(a==b);
		
		Employee e1=new Employee(1, "ABC");
		Employee e2=new Employee(1, "ABC");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
