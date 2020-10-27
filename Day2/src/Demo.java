
public class Demo {

	public static void main(String[] args) {

		Employee e = new Employee("EMP", 1500, 10000);
		Manager m = new Manager("MGR", 1500, 10000);
		MarketingExecutive mr = new MarketingExecutive("MARKETING", 1500, 10000, 75);

		e.printDetails();
		m.printDetails();
		mr.printDetails();

	}

}
