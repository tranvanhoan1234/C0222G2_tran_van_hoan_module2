package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class CountInterest {
    public static void main(String[] args) {
        // tính lãi
        double money = 1.0;
        int month = 1;
        double interestRter = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter investment amount: ");
        money = input.nextDouble();
        System.out.print("enter number of months: ");
        month = input.nextInt();
        System.out.print("enter annual interest rate in percentage ");
        interestRter = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i <month ; i++) {
            totalInterest +=money*(interestRter/100)/12*month;
        }System.out.print("Total of interest: "+totalInterest);
    }
}
