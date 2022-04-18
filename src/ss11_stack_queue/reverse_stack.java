package ss11_stack_queue;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {



//        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
//        System.out.println("nhập CÁI GÌ BẠN THÍCH");
//        String s = scanner.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i) + "");
//        }
//        System.out.println("CHUỖI ĐẢO NGƯỢC");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.printf(stack.pop());

stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
        System.out.println(stack);
        for (int i = 0; i < stack.size(); ) {
            System.out.println(stack.pop());

        }
        }
    }



