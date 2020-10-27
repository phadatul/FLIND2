package Day2_Assignment;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Employee emp1 = new Employee("Ross", 500000, 20000);

		Employee emp2 = new Employee("Chandler", 1000000, 500000);

		emp1.displayData();
		emp2.displayData();
	}
}
