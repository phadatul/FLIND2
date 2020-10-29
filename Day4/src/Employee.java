import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
	public int empid;
	public String empname;
	public int empage;
	@Override
	public String toString() {
		return "[empid=" + empid + ", empname=" + empname + ", empage=" + empage + "]";
	}
	public Employee() {
		
	}
	public Employee(int empid, String empname, int empage) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
	}
//	
	
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.empid > e.empid) {
			return 1;
		}
		else if (this.empid < e.empid) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
