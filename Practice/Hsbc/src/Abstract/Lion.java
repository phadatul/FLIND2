package Abstract;

public class Lion extends Animal implements Carnivorus{

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lion eats");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("lion walks");
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("Lion is a Carinvour");
	}

}
