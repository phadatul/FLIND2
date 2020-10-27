public class IdGenerator {
    private static int current = 0;

    public static int generateId() {
        current++;
        return current;
    }
}
