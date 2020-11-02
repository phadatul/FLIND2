
public class Add {
	Integer i = 1;
public Add() {
}

public int add(int... num) {
	int sum=0;
	for(i=0;i<num.length;i++)
	{
		sum+=num[i];
	}
	return sum;
}

}
