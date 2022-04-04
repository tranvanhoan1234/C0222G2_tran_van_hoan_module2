package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        year = scanner.nextInt();
        // năm nhuận

//        System.out.println("enter a yead");
//        year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap yead", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
// cach 2;
//        boolean isLeapYear = false;
//        year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            }else {
//                isLeapYear =false;
//            }
//        }
//if (isLeapYear){
//    System.out.printf("%d is a leap year", year);
//}else   {
//    System.out.printf("%d is NOT a leap year", year);
//}
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }

            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
