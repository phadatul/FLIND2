package Day2;

public class test extends PackageTest{
	
	public test(){
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
//		Employee e1 = new Employee(456,"Ross");
//		Employee e2 = new Employee(353,"Monica");
//		
//		System.out.println(e1);
//		System.out.println(e2);
		
//		
//		int a = 5;
//		int b = 7;
//		System.out.println(a==b);
		
//		Day3.Employee e1 = new Day3.Employee(456,"Ross");
//		Day3.Employee e2 = new Day3.Employee(456,"Monica");
//		
//		System.out.println(e1.equals(e2));
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
		
		PackageTest pt = new PackageTest();
		test t = new test();
		System.out.println(t.a);
		System.out.println(t.d);
		//extends i.e inheritance allows access to protected
		System.out.println(t.c);
	}
}
