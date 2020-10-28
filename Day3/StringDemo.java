public class StringDemo {
    /**
     * Replaces the first character of string with its uppercase
     */
    public static String myReplaceMethod(String s) {
        char c = s.charAt(0);
        if (!((int)c >= 'a' && (int)c <= 'z')) return s;

        c = (char)((int)c - (int)'a' + (int)'A');
        String x = s.substring(1, s.length());
        return c + x;
    }

    public static void main(String[] args) {
        String s = new String("Hello World");
        String s1 = "Hello World"; // String Literal (pool)

        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace(/* old */ "o", /* new */ "*"));
        System.out.println(s.replaceFirst("o", "*"));
        System.out.println(s.substring(1, 3 /* end index */));

        StringBuffer sb = new StringBuffer("Hello World"); // or StringBuilder
        sb.append(", Bye Bye");
        System.out.println(sb);

        System.out.println(myReplaceMethod("hello"));
        System.out.println(myReplaceMethod("World"));
        System.out.println(myReplaceMethod("!ping"));
        System.out.println(myReplaceMethod("world"));
    }
}
