public class Employee {

  private int empid;
  private String ename;
  private double basicSalary;
  private double HRA, medical, PF, netSalary, grossSalary;
  private static double PT = 200;
  private static int counter = 0;

  public Employee() {
    counter++;
    this.empid = this.counter;
  }

  public Employee(String ename, double salary, double medical) {
    this();

    this.ename = ename;
    this.basicSalary = salary;
    this.HRA = salary / 2;
    this.PF = 0.12 * salary;
    this.medical = medical;

  }

  public void getEmployeeDetails() {
    System.out.println("ID:" + empid);
    System.out.println("Name:" + ename);
    System.out.println("Gross Salary:" + grossSalary());
    System.out.println("Net Salary:" + netSalary());

  }

  public double grossSalary() {
    this.grossSalary = this.basicSalary + this.HRA + this.medical;
    return (this.grossSalary);
  }

  public double netSalary() {

    this.netSalary = this.grossSalary() - this.PT - this.PF;
    return (this.netSalary);

  }
}