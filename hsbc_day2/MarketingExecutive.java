public class MarketingExecutive extends Employee {
    public MarketingExecutive(String employeeName, double basicSalary, double medical, int kilometersTravelled) {
        super(employeeName, basicSalary, medical);

        this.kilometersTravelled = kilometersTravelled;
        tourAllow = 5 * kilometersTravelled;
        telephoneAllow = 1500;

        calculateAll();
    }

    @Override
    public double getAllows() {
        return super.getAllows() + tourAllow + telephoneAllow;
    }

    @Override
    public void DisplayDetails() {
        System.out.println("== MarketingExecutive details ==");
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Net Salary: " + getNetSalary());
    }

    private int kilometersTravelled;
    private double tourAllow;
    private static double telephoneAllow;

}
