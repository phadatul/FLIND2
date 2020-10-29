import java.util.*;

public class MyStack<T> {
    private ArrayList<T> arr = new ArrayList<T>();

    public void push(T data) {
        arr.add(data);
    }

    public T pop() {
        return arr.remove(arr.size() - 1);
    }

    public void print() {
        System.out.println(arr);
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(12);
        stack.push(88);
        stack.push(6);
        stack.push(121);
        stack.print();

        stack.pop();
        stack.print();
    }
}
