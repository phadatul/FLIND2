
public class Employee {
 private String EmployeeId;
 private String EmployeeName;
 private double BasicSal;
 private double HRA;
 private double Medical, PF, NetSal, GrossSal;
 private static double PT=200;
 
 public Employee(){
	 
 }
 
 public Employee(String id, String name, double sal, double med){
	 this.EmployeeId=id;
	 this.EmployeeName=name;
	 this.BasicSal=sal;
	 this.PF=0.12*sal;
	 this.HRA=0.5*sal;
	 this.Medical=med;
	 this.GrossSal=this.calculateGrossSal();
	 this.NetSal=this.calculateNetSal();
 }
 
 public void EmpDetails(){
	 System.out.println("Employee Name: "+this.EmployeeName);
	 System.out.println("Employee Id: "+ this.EmployeeId);
	 System.out.println("Basic Salary: "+ this.BasicSal);
	 System.out.println("Gross Salary: "+ this.GrossSal);
	 System.out.println("Net Salary: "+ this.NetSal);
 }
 
 public double calculateNetSal(){
	 return (this.calculateGrossSal()-(PT+this.PF));
 }
 
 public double calculateGrossSal(){
	 return (this.BasicSal+this.HRA+this.Medical);
 }
 
}
