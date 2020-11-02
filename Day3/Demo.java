package Day3;

public class Demo {
	
	final int id;
	final String name;
	
	public Demo() {
		id = 0;
		name = null;
	}
	
	public Demo(int id, String name)
	{
		this.id= id;
		this.name = name;
	}
	public static void main(String[] args) {
		
		final int x = 19;
		
		//here it allows to change values inside because here final is the reference of the base address of the array.
		// we won't be allowed to reallocate it to a new address.
		final int[] a = {10,20,30};
		a[0] = 15;
		a[1] = 30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		Demo d = new Demo(40, "Patrick");
		System.out.println(d.id);
		System.out.println(d.name);
		//d.id = 30;
		
	}

}
