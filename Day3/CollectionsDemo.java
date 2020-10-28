import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(89);
        list.add(56);
        list.add(5);
        list.add(1);

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        HashSet hashSet = new HashSet();
        hashSet.add(12);
        hashSet.add(89);
        hashSet.add(56);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(56);
        hashSet.add(5);
        hashSet.add(1);
        System.out.println(hashSet);

        TreeSet treeSet = new TreeSet();
        treeSet.add(12);
        treeSet.add(89);
        treeSet.add(56);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(56);
        treeSet.add(5);
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
