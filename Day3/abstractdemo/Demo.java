package abstractdemo;

public class Demo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();

        lion.walk();
        elephant.eat();

        lion.hello();
        elephant.hello();
    }
}
