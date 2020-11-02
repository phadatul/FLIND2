package Day4;

public class Employee implements Comparable<Employee>{
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int empId;
	public String empName;
	public int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", salary=" + salary+"\n";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId-o.empId;
	}
	
	
}
