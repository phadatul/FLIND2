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
    }

    public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
        this.employeeId = employeeId;
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

    private void calculateGrossSalary() {
        grossSalary = basicSalary + hra + medical;
    }

    private void calculateNetSalary() {
        netSalary = grossSalary - (pt + pf);
    }
}
