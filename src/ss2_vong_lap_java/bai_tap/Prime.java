package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number");
        int number = scanner.nextInt();
        int n = 0;
        int count = 0;
        System.out.print("số nguyên tố n: ");
        while (count < number) {
            boolean flag = true; // so nguyen to
            if (n < 2) { //xet khong phai so nguyen to
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {

                    if (n % i == 0) {
                        flag = false;
                    }
                }
            }
            if (flag == true) {  //neu flag true thif la so nguyen to
                System.out.print(n + ",");
                count++; //biesn dem so nguyen to nhap tu number
            }
            n++; // neu la so nguyen to tang len 1
        }
    }
}
