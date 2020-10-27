public class Calculator {
    public int add(int ...nums) {
        int total = 0;
        for (int i = 0; i < nums.length; ++i) {
            total += nums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2, 3, 4, 5));
    }
}
