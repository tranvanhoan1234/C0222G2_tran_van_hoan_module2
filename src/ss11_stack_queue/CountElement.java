package ss11_stack_queue;

import java.util.Map;
import java.util.TreeMap;

public class CountElement {
    public static void main(String[] args) {
        String string = "llllllllluanhamMMMMchoiiiiiiiiiiii";
        string = string.toLowerCase();
        Map<Character, Integer> treMap = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!treMap.containsKey(string.charAt(i))) {
                treMap.put(string.charAt(i), 1);
            } else {
                treMap.put(string.charAt(i), treMap.get(string.charAt(i)) + 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : treMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
