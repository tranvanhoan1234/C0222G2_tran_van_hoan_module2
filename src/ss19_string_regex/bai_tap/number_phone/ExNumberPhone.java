package ss19_string_regex.bai_tap.number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExNumberPhone {
    private static final String ACCOUNT_REGEX = "^[84]+[0-9\\-]{10}$";

    public ExNumberPhone() {
    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
