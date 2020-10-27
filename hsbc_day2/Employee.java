public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary,hra, medical, pf, pt = 200, netSalary, grossSalary;

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
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

    public Employee() {
        this.employeeId = IdGenerator.generateId();
    }

    public Employee(String employeeName, double basicSalary, double medical) {
        this();
        this.medical = medical;
        this.basicSalary = basicSalary;
        this.employeeName = employeeName;

        calculateHRA();
        calculatePF();
        calculateGrossSalary();
        calculateNetSalary();
    }

    private void calculateHRA() {
        this.hra = 0.5 * basicSalary;
    }

    private void calculatePF() {
        this.pf = 0.12 * basicSalary;
    }

    public double getAllows() {
        return this.hra + this.medical;
    }

    private void calculateGrossSalary() {
        this.grossSalary = this.basicSalary + getAllowances();
    }

    private void calculateNetSalary() {
        this.netSalary = this.grossSalary - (this.pt + this.pf);
    }

    public void calculateAll() {
        calculateHRA();
        calculatePF();
        calculateGrossSalary();
        calculateNetSalary();
    }

    public void DisplayDetails() {
        System.out.println("ID: " + this.employeeId);
        System.out.println("Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Medical: " + this.medical);
        System.out.println("Gross Salary: " + this.grossSalary);
        System.out.println("Net Salary: " + this.netSalary);
    }
}
