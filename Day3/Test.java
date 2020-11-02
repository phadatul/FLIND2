package Day3;


public class Test {
	public static void main(String[] args) {
		Employee e = new Employee(1,"Ted");
		//int[] arr = {10,20,30};
		//ArrayList<Integer> arr1 = new ArrayList<Integer>();
		//System.out.println(arr.toString());
		
		System.out.println(e);
		
		Employee e1 = new Employee(1,"Patrick");
		Employee e2 = new Employee(1,"Patrick");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		
	}

}
