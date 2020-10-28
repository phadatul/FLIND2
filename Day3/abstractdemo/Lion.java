package abstractdemo;

public class Lion extends Animal implements Carnivorus {
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void walk() {
        System.out.println("Lion walks");
    }

    @Override
    public void eatMeat() {
        System.out.println("Lion is carnivorus");
    }
}
