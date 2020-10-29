import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        arrayListDemo();
        vectorDemo();
    }

    public static void arrayListDemo() {
        ArrayList arr = new ArrayList();
        arr.add("hi");
        arr.add("hello");
        arr.add("bye");
        Collections.sort(arr);
        System.out.println(arr);
    }

    public static void vectorDemo() {
        // Vector is thread safe
        // whereas ArrayList is not
        Vector vec = new Vector();
        vec.add("hi");
        vec.add("hello");
        vec.add("bye");
        Collections.sort(vec);
        System.out.println(vec);
    }
}
