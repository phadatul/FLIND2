
public class Employee {
 String EmployeeId;
 String EmployeeName;
 double BasicSal;
 double HRA;
 double Medical;
 double PF;
 double PT=200;
 double NetSal;
 double GrossSal;
 
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
