package Day2;

public class Car extends Vehicle{

	//METHOD OVVERIDING - only after inheritance has happened.
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move(); //will first execute all commands happening in the method in parent class and then will execute the code below.
		System.out.println("CAR MOVES");
		
		
	}

}
