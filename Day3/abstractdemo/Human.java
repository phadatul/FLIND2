package abstractdemo;

public class Human extends Animal {
    @Override
    public void eat() {
        System.out.println("Human eats");
    }

    @Override
    public void walk() {
        System.out.println("Human walks");
    }
}
