package abstractdemo;

public class Elephant extends Animal {
    @Override
    public void eat() {
        System.out.println("Elephant eats");
    }

    @Override
    public void walk() {
        System.out.println("Elephant walks");
    }
}

