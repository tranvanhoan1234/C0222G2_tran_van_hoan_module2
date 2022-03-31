package ss1_java.thuc_hanh;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
//        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        //        int month = scanner.nextInt();
//        switch (month) {
//            case 2:
//                System.out.println("The month '2' has 28 or 29 days!");
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("The month '" + month + "' has 31 days!");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("The month '" + month + "' has 30 days!");
//                break;
//            default:
//                System.out.println();
//                break;
//
//        }
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = ":28 of 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                daysInMonth = ": có 31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = ": có 30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "") {
            System.out.println("The month '%d' has %s days! "+ month + daysInMonth);

        } else {
            System.out.println("Invalid input!");
        }
    }
}
