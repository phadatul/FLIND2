package Day3;

public class Employee {
	private int empid;
	private String ename;
	
	public Employee() {
		
	}
	public Employee(int empid, String ename) {
		
		this.empid = empid;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [ID:" + empid + ", Name:" + ename + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empid;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this == obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Employee e = (Employee) obj;
		
		if(this.empid == e.empid)
			return true;
		else
			return false;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}
