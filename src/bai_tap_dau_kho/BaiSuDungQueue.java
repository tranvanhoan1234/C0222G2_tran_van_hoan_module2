package bai_tap_dau_kho;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiSuDungQueue {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        for (Integer s:queue) {
            System.out.println(s);
        }

        System.out.println("enter số lần chạy: ");
        Integer a= Integer.valueOf(scanner.nextLine());
        System.out.println("-----------------");
        for (int i = 0; i <a ; i++) {
            queue.offer(queue.element());
            queue.offer(queue.poll());

        }
        for (Integer s:queue) {
            System.out.println(s);

        }
    }


    }



