package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        //ve hinh

        int choice = 1;
        String str = "";
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1 Print the rectangle");
            System.out.println("2 Print the square triangle");
            System.out.println("3Print isosceles triangle");
            System.out.println("0 enter end");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1 Print the rectangle");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 20; j++) {
                            str = str + "*";


                        }
                        System.out.println(str);
                        str = "";

                    }
                    break;
                case 2:
                    System.out.println("2 Print the square triangle botton-left");
                    for (int i = 0; i < 20; i++) {
                        for (int j = 0; j <= i; j++) {
                            str = str + "*";

                        }
                        System.out.println(str);
                        str = "";
                    }
                    break;
                case 3:
                    for (int i = 20; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            str = str + "*";
                        }
                        System.out.println(str);
                        str = "";
                    }
                    break;
            }

        }
    }
}
