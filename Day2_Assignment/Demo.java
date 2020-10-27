package Day2_Assignment;


public class Demo {
	public static void main(String[] args) {
		Employee e = new Employee("David", 90000, 40000);
		
		
		Employee e2 = new Employee("Moira", 700000, 40000);
		
		Employee e3 = new Employee();
		
		e.displayData();

		e2.displayData();
		
		e3.displayData();
		
		Manager m = new Manager("Johnny", 150000,40000);
//		m.ename = "Johnny";
//		m.basic_sal = 150000;
//		m.medical = 4000;
		m.displayData();
		
		MarketingExecutive me = new MarketingExecutive("Alexis", 40000, 40000, 3000);
//		me.ename = "Alexis";
//		me.basic_sal = 40000;
//		me.medical = 40000;
		me.displayData();
		
	}

}
