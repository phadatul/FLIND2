package Day2;

public class Car extends Vehicle{

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	//Overhiding
	public static void move() {
		// TODO Auto-generated method stub
		System.out.println("Car moves");
	}
	
	@Override
	public Car trying() {
		// TODO Auto-generated method stub
		return null;
	}

}
