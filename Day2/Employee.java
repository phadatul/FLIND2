public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private static double pt = 200;
    private double netSalary;
    private double grossSalary;

    public Employee() {
        this.employeeId = IdGenerator.generateId();
    }

    public Employee(String employeeName, double basicSalary, double medical) {
        this();
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.medical = medical;

        calculateHRA();
        calculatePF();
        calculateGrossSalary();
        calculateNetSalary();
    }

    private void calculateHRA() {
        hra = 0.5 * basicSalary;
    }

    private void calculatePF() {
        pf = 0.12 * basicSalary;
    }

    public double getAllowances() {
        return hra + medical;
    }

    private void calculateGrossSalary() {
        grossSalary = basicSalary + getAllowances();
    }

    private void calculateNetSalary() {
        netSalary = grossSalary - (pt + pf);
    }

    public void update() {
        calculateHRA();
        calculatePF();
        calculateGrossSalary();
        calculateNetSalary();
    }

    public void printDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Medical: " + medical);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }
}
