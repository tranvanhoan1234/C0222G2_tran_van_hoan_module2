package ss19_string_regex.bai_tap.name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassLearn {
//    [A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)
    private static final String ACCOUNT_REGEX = "^[CAD]+[0-9]{4}+[GHIKLM]$";

    public ClassLearn() {
    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }



}
