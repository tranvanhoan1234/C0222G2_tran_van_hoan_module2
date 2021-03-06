package case_study.utils.check_try_cacth;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckException {
    private final static String PATTERN = "dd-MM-yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
    private static Scanner sc = new Scanner(System.in);

    public static Double checkExForParseDouble() {
        boolean check = true;
        Double value1=0d;
        while (check) {
            try {
                value1 = Double.parseDouble(sc.nextLine());
                check = false;
            }catch (NumberFormatException a){
                System.err.println("Error: " + a.getMessage());
            }catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println(">>> Enter again: ");
            }
        }
        return value1;
    }

    public static Long checkExForParseLong(String value) {
        boolean check = true;
        Long value1 = 0l;
        while (check) {
            try {
                value1 = Long.parseLong(value);
                check = false;

            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
                System.out.print("Enter again: ");
                value = sc.nextLine();
                check = true;

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                check = true;
            }
        }
        return value1;
    }

    public static Integer checkExForParseInteger() {
        while (true) {
            try {
                int value1 = Integer.parseInt(sc.nextLine());
                return value1;
            }catch (NumberFormatException a){
                System.err.println("Error: " + a.getMessage());
            }catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println(">>> Enter again: ");
            }
        }
    }

}
