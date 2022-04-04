package ss3_array.thuc_hanh;

import java.util.Scanner;

public class Bai3FindTheLargestValueInAnArray {
    //tim gia tri lon nhat trong mang.
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter a size: ");
            size = sc.nextInt();
            if (size < 20) {
                System.out.print("Size should not exceed 20");
            }
        }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter element" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
    }
}
