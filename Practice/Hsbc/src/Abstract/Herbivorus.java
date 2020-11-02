package Abstract;

public interface Herbivorus {
	public static final double pi = 3.1416;
	public abstract void noMeat();
	public default void someTask() {
		System.out.println("sometask");
	}
}
