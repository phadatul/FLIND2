package Day2;

public class Person {
	private int id;
	private String name;
	public static Person p = null;
	static public Address adr;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Singleton Example
	private Person() {
		// TODO Auto-generated constructor stub
		adr = new Address();
		System.out.println("Private Constructor");
	}
	//Since static only at a time 1 object can exist in the memory
	public static Person getObject() {
		if(p==null) {
			 p = new Person();
			 return p;
		}
		else {
			System.out.println("Object Already Exists");
			return p;
		}
	}

}
