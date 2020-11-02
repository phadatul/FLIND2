package Day3;

//Java Bean - - JavaBean Naming Conventions
public class Employee {
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if(this.empId==e.empId)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	
}
