package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;  //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }

        } while (size > 20);

        array = new int[size];//Nhập giá trị cho các phần tử của mảng
        int i = 0;
        while (i < array.length) {

            System.out.println("enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");//In ra mảng đã nhập
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) { // dao nguoc nua mang;
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;

        }
        System.out.printf("%-20s%s", "Reverse array: ", "");//in ra kgi dao dc mang
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
