package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai4MaxArray {
    public static void main(String[] args) {

        // TÌM PHẦN TỬ LỚN NHẤT TRONG MANGR2 CHIỀU
        int[][] array = {
                {18, 26, 32, 43, 5},
                {23, 324, 75, 34, 55},
                {17, 25, 32, 44, 5},
                {12, 24, 35, 46, 57},

        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("max: "+max);
    }
}


