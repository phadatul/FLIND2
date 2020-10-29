package hsbc.stackpractice;

public class Stack {

	private double arr[]= {};
	private int n;
	private double x;
	
	public Stack() {
		
	}
	
	public Stack(double arr[], int n, double x) {
		
		this.arr= arr;
		this.n= n;
		this.x= x;
	}
	
	public static double[] addX(int n, double arr[], double x) 
    { 
        int i; 
  
        // create a new array of size n+1 
        double newarr[] = new double[n + 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        return newarr; 
    } 
	
	
}
