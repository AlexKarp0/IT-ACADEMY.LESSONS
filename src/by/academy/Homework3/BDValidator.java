package by.academy.Homework3;

import java.util.function.DoubleBinaryOperator;
import java.util.regex.Pattern;

public class BDValidator implements Validator {
    public static String BD_PATTERN = "([0-2][0-9]||3[0-1])(/||-)(0[0-9]||1[0-2])(/||-)(19||20)[0-9]{2}";

    @Override
    public Pattern getPattern() {
        return Pattern.compile(BD_PATTERN);
    }
}
