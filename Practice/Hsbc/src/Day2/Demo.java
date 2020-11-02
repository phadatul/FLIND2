package Day2;

public class Demo {
	
	static {
		System.out.println("In Static Block");
	}
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		tryEmployee e3 = new tryEmployee(12,"ABC",55000);
//		e3.printEmp();
//		tryEmployee e4 = new tryEmployee(12,"ABC",55000,"IIITD");
//		e3.printEmp();
//		e4.printEmp();
		
//		
//		
////		Person p = new Person();
//		p.setId(2);
//		p.setName("Monica");
//		
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		
//		Person p1 = Person.getObject();
//		Person p2 = Person.getObject();
//		Person p3 = Person.getObject();
//		Person p4 = Person.getObject();
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
		
//		Person p1 = Person.getObject();
//		System.out.println(p1.adr.getAddress());
//		System.out.println(Person.adr.getAddress());
		
//		int[] ar = {2,2,3,4,5,6,7,8};
		
		Calculator c = new Calculator();
		int sum = c.add(2,3,4,4,5,6,7,8,99);
		System.out.println(sum);
		System.out.println(c.add(2));
	}

}
