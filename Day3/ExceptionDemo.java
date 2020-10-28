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

import java.io.*;
import java.sql.*;

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

    /* we declare checked exception using `throws` keyword */
    public static void hello() throws IOException {
        /* checked exception */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
    }

    /* example of `throw` exception */
    public static void foo() throws SQLIntegrityConstraintViolationException {
        throw new SQLIntegrityConstraintViolationException();
    }

    public static void bar() throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {
}
