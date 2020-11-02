package Day2;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public Integer add(int a) {
		return 0;
	}
	public Integer add(int... ar) { //VAR ARGS
		Integer sum=0;
		for(int i:ar) {
			sum+=i;
		}
		return sum;
	}
	
}
