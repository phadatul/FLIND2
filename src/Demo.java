
public class Demo {
	public static void main(String[] args) {
		MarketingExecutive emp = new MarketingExecutive("Nikhil",1500,10000,100);
		Manager emp2 = new Manager("Nikhil",1500,10000);
		emp.printEmp();
		emp2.printEmp();
		ShowDetails(emp);
		ShowDetails(emp2);
	}
	
	public static void ShowDetails(Employee emp) {
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.calcGrossSalary());
		System.out.println(emp.calcNetSalary());
		
	}

}
