public class MyStack {
    private Object[] arr;
    private int currentIndex;

    public MyStack(int capacity) {
        currentIndex = -1;
        arr = new Object[capacity];
    }

    public void push(Object element) {
        currentIndex++;
        arr[currentIndex] = element;
    }

    public Object pop() {
        if (currentIndex < 0) return null;
        Object element = arr[currentIndex];
        currentIndex--;
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= currentIndex; ++i) {
            sb.append(arr[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
