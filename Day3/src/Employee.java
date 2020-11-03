

//JavaBean  - -  JavaBean Naming Conventions
public class Employee {
	private int empid;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID:" + this.empid + ",NAME:" + this.name;
	}

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return this.empid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}



}
