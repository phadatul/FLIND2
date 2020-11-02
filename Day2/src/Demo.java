 
public class Demo {
public static void main(String[] a)
{
	
	/*
	 * Employee emp1=new Employee("AB",100000,2000);
	Employee emp2=new Employee("BC",110000,2000);
	Employee emp3=new Employee("CD",120000,2000);
	
	emp1.printEmp();
	emp2.printEmp();
	emp3.printEmp();
	Add num=new Add();
	System.out.println(num.add(1,2,3));
	System.out.println(num.add(2,3,6));
	*/
	Employee e = new Employee("AB",100000,2000);
	Manager m=new Manager("AB",100000,2000);
	MarketingExecutive me= new MarketingExecutive("AB",100000,2000,100);
	e.printEmp();
	m.printEmp();
	me.printEmp();
	Employee.method();
	Manager.method();
}
}
