
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(45, "Abc", 10000, 1500);
		Manager m = new Manager(12, "def", 10000, 1500);
		MarketingExecutive me = new MarketingExecutive(01, "mar", 10000, 1500, 100);
		
		e1.showdetails();
		m.showdetails();
		me.showdetails();
	}

}
