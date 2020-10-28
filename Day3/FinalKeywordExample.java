public class FinalKeywordExample {
    final int id;
    final String name;

    public FinalKeywordExample() {
        id = 0;
        name = null;
    }

    public static void main(String[] args) {
        final int x = 19;
        final int[] a = {1, 2, 3};
        a[0] = 15;
        a[1] = 25;

        for (int i : a) {
            System.out.println(i);
        }
    }
}
