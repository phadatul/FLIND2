import java.util.*;

public class MyStack {
    private ArrayList arr = new ArrayList();

    public void push(int data) {
        arr.add(data);
    }

    public int pop() {
        return (int)arr.remove(arr.size() - 1);
    }

    public void print() {
        System.out.println(arr);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(88);
        stack.push(6);
        stack.push(121);
        stack.print();

        stack.pop();
        stack.print();
    }
}
