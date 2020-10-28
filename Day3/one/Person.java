package one;

public class Person {
    private String name;
    protected String nickName;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [" + name + "]";
    }

    protected String getNickName() {
        return nickName;
    }

    protected void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
