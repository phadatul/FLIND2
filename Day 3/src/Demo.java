
public class Demo {
	final int id;
	final String name;
	public Demo() {
		id = 0;
		name = null;
	}
	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		
		final int a = 9;
//		a = 11;
		System.out.println(a);
		final int a1[] = {10,20,30};
		a1[0] = 15;
		System.out.println(a1[0]);
		
		
		
	}
}
