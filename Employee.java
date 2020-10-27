public class Employee {
	public int empid;
	public String ename;
	public double basicSalary, HRA, medical, pf, pt, netSalary, grossSalary;
	public static String comp = "abc";

	public Employee() {

	}

	public Employee(int id, String name, int sal, int medical) {
		this.empid = id;
		this.ename = name;
		this.basicSalary = sal;
		this.HRA = 0.5 * sal;
		this.pf = 0.12 * sal;
		this.pt = 200;
		this.medical = medical;
		this.grossSalary = this.basicSalary + this.HRA + this.medical;
		this.netSalary = this.grossSalary - this.pt - this.pf;
	}

	public void printEmpSalaries() {
		System.out.println("gross salary:" + this.grossSalary);
		System.out.println("net salary:" + this.netSalary);
	}
}