package DbDemo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		DatabaseEmployee de = new DatabaseEmployee();
		de.insert(4, "bsd", 100);
		de.update(2000, 4);
		de.select();
	}
}
