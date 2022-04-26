package ss19_string_regex.bai_tap.name_class;

import java.util.Scanner;

public class ClassLearnTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập mã kiểm thử đi mầy: ");
        String className = scanner.nextLine();

        System.out.println(ClassLearn.validate(className));


    }
    }

