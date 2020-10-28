
public class Demo {
	
	final int id;
	final String name;
	
	public Demo() {
		id=0;
		name=null;
	}
	
	
	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public static void main(String[] args) {
		final int x = 19;
	
		final int a[] = { 10, 20, 30 };
		System.out.println(a);
		a[0] = 15;
		a[1] = 25;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a);
	}

}
