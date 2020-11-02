package Day2;

public class Person {
	
	private static Person obj = null;
	private int id;
	private String name;
	static int counter = 0;
	
	//concept for containment
	public Address adr;
	
	
	private Person()
	{
		adr = new Address();
	}
	
//	public static Person getInstance() {
//		counter++;
//		System.out.println(counter);
//		return new Person();
//	}
	
	public static Person createObject() {
		if(obj == null)
		{
			obj = new Person();
			System.out.println("New object created");
			return obj;
		}
		
		System.out.println("Object already exists!");
		//return new Person();
		return obj;
	}
	
	

	public int getId() {
		//additional code for authentication and authorization
		return id;
	}

	public void setId(int id) {
		//additional code for authentication
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
