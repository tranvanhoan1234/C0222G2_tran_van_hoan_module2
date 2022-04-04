package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter a number: ");
            number = sc.nextInt();
            sum = +number;
        } while (number != 0);
        System.out.print("the sum is" + sum);
    }
}
