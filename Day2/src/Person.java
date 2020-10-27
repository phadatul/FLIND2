
public class Person {
	private int id;
	private String name;
	public static Person p = null;
    public Address adr;

	private Person() {
		// TODO Auto-generated constructor stub
		adr=new Address();
	}

	public static Person getInstance() {
		if (p == null) {
			p = new Person();
			return p;
		} else {
			System.out.println("OBJECT ALREADY EXIST!!!!");
			return p;
		}
	}

	public int getId() {
		// additional code for authentication & authorization
		return id;
	}

	public void setId(int id) {
		// additional code for authentication
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("hello");
	}

}
