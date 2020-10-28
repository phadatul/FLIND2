
import java.util.HashMap;
import java.util.Map;
 
public class CountWordTest {
    public static void main(String[] args) {
        CountWordTest countWordTest = new CountWordTest();
        countWordTest.countWords("hello world how are you where are you what is your name how is your car");
    }
 
    public void countWords(String input) {
        Map <String, Integer> map = new HashMap <String, Integer> ();
 
        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count = map.get(str);
                    map.put(str, count + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
 
        System.out.println("Count :- " + map);
    }
 
}
