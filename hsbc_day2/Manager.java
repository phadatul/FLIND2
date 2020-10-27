public class Manager extends Employee {
    public Manager(String employeeName, double basicSalary, double medical) {
        super(employeeName, basicSalary, medical);

        petrolAllow = 0.08 * basicSalary;
        foodAllow = 0.13 * basicSalary;
        otherAllow = 0.03 % basicSalary;

        calculateAll();
    }

    @Override
    public double getAllows() {
        return super.getAllows() + petrolAllow + foodAllow + otherAllow;
    }

    @Override
    public void DisplayDetails() {
        System.out.println("== Manager details ==");
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Net Salary: " + getNetSalary());
    }
    private double petrolAllow;
    private double foodAllow;
    private double otherAllow;
}
