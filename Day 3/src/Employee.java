
public class Employee {
	private int empid;
	private String name;
	public Employee() {
		
	}
	
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public String toString() {
		return "ID" + this.empid+ " ,NAME:"+this.name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		super.hashCode();
		return this.empid;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		super.equals(obj);
		Employee e = (Employee) obj;
		if(this.empid == e.empid) {
			return true;
		}
		else {
			return false;
		}
//		return super.equals(obj);
	}
}
