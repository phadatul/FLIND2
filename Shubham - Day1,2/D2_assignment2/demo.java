
public class demo {

	public static void main(String[] args)
	{
		Employee e = new Employee(12,"employee",1500,10000);
		Manager m = new Manager(10,"manager",1500,10000);
		MarketingExecutive me = new MarketingExecutive(10,"marketing_exec",1500,10000,600);
		
		e.printInfo();
		m.printInfo();
		me.printInfo();
	}
	
	
}
