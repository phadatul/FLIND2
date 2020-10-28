public class MarketingExecutive extends Employee {
  private double kilometersTravelled, tourAllowance;
  private static double telephoneAllowance = 1500;

  public MarketingExecutive(String ename, double salary, double medical, double kilometerstravelled) {
    super(ename, salary, medical);
    this.kilometersTravelled = kilometerstravelled;
    this.tourAllowance = 5 * this.kilometersTravelled;
  }

  public double grossSalary() {
    return super.grossSalary() + tourAllowance + telephoneAllowance;
  }
}
