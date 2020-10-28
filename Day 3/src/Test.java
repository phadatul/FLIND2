
public class Test {
	public static void main(String[] args) {
		Employee e = new Employee(6, "ABC");
		System.out.println(e.toString());
		
		Employee e1 = new Employee(6,"RST");
		System.out.println(e1.toString());
		
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
	}
}
