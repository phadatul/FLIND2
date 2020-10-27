
public class Calculator {

	public int add(int... arr) {
		int sum = 0;
		for (int i:arr) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
