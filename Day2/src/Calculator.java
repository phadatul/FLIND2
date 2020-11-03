
public class Calculator {

	public int add(int... a) {   //VAR ARGS

		int ans = 0;
		for(int x:a) {
			ans=ans+x;
		}

		return ans;
	}

}
