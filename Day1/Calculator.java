public class Calculator {
	
	public Calculator()
	{
		
	}
	
	public int add(int... arr)
	{
		int s = 0;
		for(int i=0; i<arr.length;i++)
		{
			s += arr[i];
		}
		return s;
	}

}
