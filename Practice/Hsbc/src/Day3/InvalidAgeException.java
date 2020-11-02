package Day3;

public class InvalidAgeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5505711211097084676L;

	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
		super("Valid age range is 19 to 34");
	}


}
