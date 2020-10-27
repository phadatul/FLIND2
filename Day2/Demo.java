public class Demo {
    public static void main(String[] args) {
        double commonBasicSalary = 1000.0;
        double commonMedical = 100.0;

        Employee e1 = new Employee("A", commonBasicSalary, commonMedical);
        Employee e2 = new Employee("A", commonBasicSalary, commonMedical);
        Employee e3 = new Employee();

        System.out.println(e1.getEmployeeId());
        System.out.println(e2.getEmployeeId());
        System.out.println(e3.getEmployeeId());

        // inheritance demo
        
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();

        vehicle.move();
        car.move();
        bike.move();

        // Assign2 Demo

        Manager m1 = new Manager("A", commonBasicSalary, commonMedical);
        MarketingExecutive me1 = new MarketingExecutive("B", commonBasicSalary, commonMedical, 10);

        showDetails(m1);
        showDetails(me1);
    }

    private static void showDetails(Employee e) {
        e.printDetails();
    }
}
