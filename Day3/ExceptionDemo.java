/*
 *        Throwable
 *      ______|_________
 *      |              |
 *    Error         Exception
 *               ______|_______
 *               |            |
 *            Checked     Unchecked
 *
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }

        int[] a = {11, 22};
        try {
            System.out.println(a[9]);
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }

        try {
            System.out.println(a[0]);
        } finally {
            // resources can be released in finally blocks
            System.out.println("Finally block");
        }

        System.out.println("Reached end of program");
    }
}
