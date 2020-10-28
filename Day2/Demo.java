public class Demo {

  public static void main(String[] args) {
    Employee e = new Employee("Atul", 1500, 10000);
    Manager m = new Manager("Bee", 1500, 10000);
    MarketingExecutive mr = new MarketingExecutive("Emma", 1500, 10000, 75);

    e.getEmployeeDetails();
    m.getEmployeeDetails();
    mr.getEmployeeDetails();

  }
}