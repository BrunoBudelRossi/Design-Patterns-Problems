package emailValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isEmail(String email) {
        return (email.indexOf('@') > 0 );
    }
}
