public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            foo();
        } catch (CustomCheckedException e) {
            System.out.println(e);
        }

        int age = 5;
        if (age < 18 || age > 100) {
            throw new InvalidAgeException();
        }
    }

    public static void foo() throws CustomCheckedException {
        throw new CustomCheckedException();
    }
}

class CustomCheckedException extends Exception {
    public CustomCheckedException() {
        super("I am CustomCheckedException");
    }
}

class InvalidAgeException extends RuntimeException {
}
