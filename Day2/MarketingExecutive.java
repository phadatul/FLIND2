public class MarketingExecutive extends Employee {
    private int kilometersTravelled;
    private double tourAllowance;
    private static double telephoneAllowance;

    public MarketingExecutive(String employeeName, double basicSalary, double medical, int kilometersTravelled) {
        super(employeeName, basicSalary, medical);

        this.kilometersTravelled = kilometersTravelled;
        tourAllowance = 5 * kilometersTravelled;
        telephoneAllowance = 1500;

        update();
    }

    @Override
    public double getAllowances() {
        return super.getAllowances() + tourAllowance + telephoneAllowance;
    }

    @Override
    public void printDetails() {
        System.out.println("== MarketingExecutive details ==");
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Net Salary: " + getNetSalary());
    }
}
