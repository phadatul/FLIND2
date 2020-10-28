package abstractdemo;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void walk() {
        System.out.println("Lion walks");
    }
}
