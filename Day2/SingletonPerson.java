public class SingletonPerson {
    private int id;
    private String name;

    private static SingletonPerson instance;

    private SingletonPerson() {
        id = IdGenerator.generateId();
    }

    public static SingletonPerson getInstance() {
        if (instance == null) {
            instance = new SingletonPerson();
        }

        return instance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(SingletonPerson.getInstance().getId());
        System.out.println(SingletonPerson.getInstance().getId());
        System.out.println(SingletonPerson.getInstance().getId());
    }
}
