package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("số cần đọc");
        number = sc.nextInt();

        switch (number) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("tow");
                break;
            }
            case 3: {
                System.out.println("three");
                break;
            }
            case 4: {
                System.out.println("four");
                break;
            }
            case 5: {
                System.out.println("five");
                break;
            }
            case 6: {
                System.out.println("six");
                break;
            }
            case 7: {
                System.out.println("seven");
                break;
            }
            case 8: {
                System.out.println("eight");
                break;
            }
            case 9: {
                System.out.println("nine");
                break;
            } case 10:{
                System.out.println("ten");
            }
            default:
                System.out.println("out of ability");

        }


    }
}

