package Day3;

public class StackwithArray {
	public int[] stack;
	int index;
	public StackwithArray(int index) {
		// TODO Auto-generated constructor stub
		this.stack = new int[index+1];
		this.index = 0;
	}

	public void push(int val) {
		if(index<stack.length) {
			stack[index]=val;
			index+=1;
		}
		else
			System.out.println("No memory left");
	}

	public int pop() {
		if(index>0)
			return stack[index--];
		else {
			System.out.println("Stack Empty");
			return 0;
		}
	}

	public void top() {
		if(index!=0)
			System.out.println(stack[index]);
		else
			System.out.println("Stack Empty");
	}
}
