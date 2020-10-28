package abstractdemo;

public class Elephant extends Animal implements Herbivorus {
    @Override
    public void eat() {
        System.out.println("Elephant eats");
    }

    @Override
    public void walk() {
        System.out.println("Elephant walks");
    }

    @Override
    public void eatVeg() {
        System.out.println("Elephant is herbivorus");
    }
}

