package ss15_exception_handling_Debug.bai_tap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean flag = false;
        int a = 0;
        int b= 0;
        int c=0;


            try {
                System.out.println("enter ba cạnh tam giác:  ");
                Scanner scanner = new Scanner(System.in);
                a = Integer.parseInt(scanner.nextLine());
                b = Integer.parseInt(scanner.nextLine());
                c = Integer.parseInt(scanner.nextLine());

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } catch (Exception e) {
                flag = false;
                if (a <= -1 || b <= 0 || c <= 0) {
                    System.out.println("không phải là tam giác: ");
                }
                if (a + b > c || b + c > a || a + c > b) {
                    System.out.println("là tam giác: ");
                }else {
                    System.out.println("nhập sai giữ liệu");
                }
            }

        }

}



