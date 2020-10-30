
public class Demo {
	public static void main(String[] args) {
		
		Employee e = new Employee("AAA" , 2000 , 20000);
		Manager m = new Manager("BBB" , 2000 ,20000);
		Marketing ma = new Marketing("CCC" , 2000 , 20000 , 500);
		
		e.printDetails();
		m.printDetails();
		ma.printDetails();
		
	}
}
