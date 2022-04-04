package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        int number = scanner.nextInt();

        int count = 0;
        while (count < 100) {

            boolean flag = true; //la so nguyen to
            if (count < 2) {
                flag = false;
            } else if (count > 2) { // xet khong phai so nguyen to
                if (count % 2 == 0) {
                    flag = false;

                }
            }
            for (int j = 3; j < count; j += 2) { //xet khong phai so nguyen to
                if (count % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(count + "is a prime"); //flag true la so nguyen to count ++


            }
            count++; //dem so nguyen to <100
        }
    }
}