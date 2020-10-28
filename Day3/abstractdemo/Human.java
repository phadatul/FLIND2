package abstractdemo;

public class Human extends Animal implements Carnivorus, Herbivorus {
    @Override
    public void eat() {
        System.out.println("Human eats");
    }

    @Override
    public void walk() {
        System.out.println("Human walks");
    }

    @Override
    public void eatVeg() {
        System.out.println("Some humans are herbivorus");
    }

    @Override
    public void eatMeat() {
        System.out.println("Some humans are carnivorus");
    }
}
