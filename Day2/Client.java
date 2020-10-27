public class Client {
    public static void main(String[] args) {
        double commonBasicSalary = 1000.0;
        double commonMedical = 100.0;

        Manager m1 = new Manager("A", commonBasicSalary, commonMedical);
        MarketingExecutive me1 = new MarketingExecutive("B", commonBasicSalary, commonMedical, 10);

        showDetails(m1);
        showDetails(me1);
    }

    private static void showDetails(Employee e) {
        e.printDetails();
    }
}
