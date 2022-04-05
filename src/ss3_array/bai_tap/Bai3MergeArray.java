package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai3MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int x= 0;
        int array[] = {3, 4, 5, 6, 78, 8, 9, 7, 5};
        for (int i = 0; i < array.length; i++) {
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println("add element" + x);
                    array[x] = scanner.nextInt();
                    x++;
                    break;
            }
        }
    }
}
