package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai3MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// ngẫu nhiên mảng array
        int array[] = new int[6];
        int array1[] = new int[6];
        int array2[] = new int[array.length + array1.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        //  ngau nhien mang array1
        for (int i = 0; i < array.length; i++) {
            array1[i] = (int) (Math.random() * 99);
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        // gộp phần tử vào cột hàng mảng array2
        int col = 0;
        for (int i = 0; i < array2.length; i++) {
            if (i < array.length) {
                array2[i] = array[i];
            } else {
                array2[i] = array1[col];
                col++;
            }
        } for (int a : array2) {
            System.out.print(a);
        }
    }
}
