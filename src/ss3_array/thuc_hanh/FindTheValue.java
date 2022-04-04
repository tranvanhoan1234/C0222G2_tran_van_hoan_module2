package ss3_array.thuc_hanh;

import java.util.Scanner;

public class FindTheValue {
    public static void main(String[] args) {
        // tim gia tri trong mang
        String[] students = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah", "Mallory",
                "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a name studen: ");
        String input_name = sc.nextLine();
        boolean is = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                is = true;
                break;
            }

        }
        if (!is) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
