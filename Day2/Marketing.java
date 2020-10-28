public class Marketing extends Employee {
  private double kilometersTravelled, tourAllowance;
  private static double telephoneAllowance = 1500;

  public Marketing(String ename, double salary, double medical, double kilometersTravelled) {
    super(ename, salary, medical);
    this.kilometersTravelled = kilometersTravelled;
    this.tourAllowance = 5 * this.kilometersTravelled;

  }

  public double grossSalary() {
    return super.grossSalary() + tourAllowance + telephoneAllowance;
  }
}
