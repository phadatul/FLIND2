package Day2_Assignment2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub

	}
	
	public static void main(String args[]) {
		Employee e = new Employee("EMP",100000,40000);
		Manager m = new Manager("Manager",100000,40000);
		MarketingExecutive me = new MarketingExecutive("Maketing", 100000, 40000, 15);
		
		e.displayData();
		m.displayData();
		me.displayData();
	}
}
