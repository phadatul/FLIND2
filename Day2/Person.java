/* Example to demonstrate getters and setters */
public class Person {
    private int id;
    private String name;

    /* HAS-A relation */
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setId(9);
        p.setName("ABC");
        System.out.println(p.getId());
        System.out.println(p.getName());
    }
}
