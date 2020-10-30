
public class Test {
	public static void main(String[] args) {
		Employee e = new Employee(1,"Anurag");
		Employee e1 = new Employee(1,"Anurag");
		
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());System.out.println(e1.hashCode());
		
		
		
	}
}
