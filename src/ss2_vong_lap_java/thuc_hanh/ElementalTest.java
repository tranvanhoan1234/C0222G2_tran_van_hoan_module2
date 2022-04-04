package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class ElementalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inner a number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.print(number + "IS not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <=Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.print(number + "is a prime");
            else
                System.out.print(number + "is not a prime");

        }
    }
}
