
public class Person {
	private int id;
	private String name;
	public static Person p = null;
	static int count;
	
	static {
		count = 1000;
	}

	private Person() {

	}

	public static Person getInstance() {
		if (p == null) {
			p = new Person();
			return p;
		} else {
			System.out.println("Object already exists :)");
			return p;
		}
	}

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

}
