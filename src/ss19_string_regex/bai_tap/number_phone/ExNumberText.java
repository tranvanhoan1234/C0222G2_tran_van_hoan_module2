package ss19_string_regex.bai_tap.number_phone;

import java.util.Scanner;

public class ExNumberText {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã kiểm thử đi mầy: ");
        String exNumberText = scanner.nextLine();
        System.out.println(ExNumberPhone.validate(exNumberText));
    }
}


