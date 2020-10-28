public class Manager extends Employee {
  private double petrolAllowance, foodAllowance, otherAllowance;

  public Manager() {

  }

  public Manager(String ename, double salary, double medical) {
    super(ename, salary, medical);
    this.petrolAllowance = 0.08 * salary;
    this.foodAllowance = 0.13 * salary;
    this.otherAllowance = 0.03 * salary;

  }

  public double grossSalary() {
    return super.grossSalary() + petrolAllowance + foodAllowance + otherAllowance;
  }
}
