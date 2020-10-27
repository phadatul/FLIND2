
public class Employee {
	
	public int empid;
	public String ename;
	public int salary;
	public static String company_name="HSBC";
	
	public Employee() {
		
		this(1,"Ava",1234);
		System.out.println("DEFAULT CONSTR.");
	}
	
	public Employee(int id, String name, int sal) {
		
		//this();
		System.out.println("PARAMETERIZED CONSTR.");
		
		this.empid= id;
		this.ename= name;
		this.salary= sal;
	}
	
	public void printEmp() {
		
		System.out.println("ID:" +empid);
		System.out.println("NAME:" +ename);
		System.out.println("SALARY:" +salary);
	}
	
	
	private int number;  
    public int getNumber() {  
        return number;  
    }  
    public void setNumber(int newNumber) {  
        number = newNumber;  
    }
    
    private int Age;  
    public int getAge() {  
        return this.Age;  
    }  
    public void setAge(int Age) {  
        this.Age = Age;  
    }  
}