import java.util.LinkedList;
import java.util.Queue;

public class BaiSuDungQueue {
    public static void main(String[] args) {
Queue<String> queue = new LinkedList<String>();

        queue.add("One");
        queue.add("fwo");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        for (String a:queue) {
            System.out.println(a+"\n");
            String fi = String.valueOf(queue.add(queue.remove()));

            System.out.println(fi);

        }

    }
    }



