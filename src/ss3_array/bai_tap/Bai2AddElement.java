package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai2AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  duyệt mảng hiển thị
        int array[] = {6, 2, 5, 2, 1, 7, 9, 8, 10};
        for (int i = 0; i < array.length; i++) {
        }
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("enter x: ");
        int a = scanner.nextInt();
        System.out.println(" enter index");
        int index = scanner.nextInt();
        // đk indexh vị trí k dc nhập số âm
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("enter not a number âm ");

        } else {
            // ngược đúng thì thêm phần tử vào mảng ở vị trí index
            for (int i = array.length - 1; i < index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = a;
            System.out.println("new array");
            for (int q : array) {
                System.out.println(q);

            }

        }

    }

}



