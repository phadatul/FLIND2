package Abstract;

public class Elephant extends Animal implements Herbivorus{

	public Elephant() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("elephant eat");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Elephant walk");
	}

	@Override
	public void noMeat() {
		// TODO Auto-generated method stub
		System.out.println("Elephant is herbivor");
	}

}
