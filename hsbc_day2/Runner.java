public class Runner {
    public static void main(String[] args) {

        Employee emp1 = new Employee("A", 10000, 1000);
        Employee emp2 = new Employee("A", 10000, 1000);
        Employee emp3 = new Employee();

        System.out.println(emp1.getEmployeeId());
        System.out.println(emp2.getEmployeeId());
        System.out.println(emp3.getEmployeeId());

        //------------------------------------------
        Manager mang = new Manager("A", 10000, 1000);
        MarketingExecutive markex = new MarketingExecutive("B", 10000, 1000, 10);

        mang.DisplayDetails();
        markex.DisplayDetails();
    }
}
