public class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;

    public Manager(String employeeName, double basicSalary, double medical) {
        super(employeeName, basicSalary, medical);

        petrolAllowance = 0.08 * basicSalary;
        foodAllowance = 0.13 * basicSalary;
        otherAllowance = 0.03 % basicSalary;

        update();
    }

    @Override
    public double getAllowances() {
        return super.getAllowances() + petrolAllowance + foodAllowance + otherAllowance;
    }

    @Override
    public void printDetails() {
        System.out.println("== Manager details ==");
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Net Salary: " + getNetSalary());
    }
}
