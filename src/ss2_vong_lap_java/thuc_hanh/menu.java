package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.print("menu");
            System.out.print(" draw the  square");
            System.out.print(" Draw the rectangle");
            System.out.print(" Exit");
            System.out.print("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1 draw the  square");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
