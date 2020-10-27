public class Calculator {
    public int add(int ...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20, 30, 40, 50));
    }
}
