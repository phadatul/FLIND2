package Abstract;

public abstract class Human extends Animal implements Herbivorus,Carnivorus{

	public Human() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Human eats");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human walks");
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("Some are carnivour");
	}

	@Override
	public void noMeat() {
		// TODO Auto-generated method stub
		System.out.println("Some are herbivour");
	}

}
