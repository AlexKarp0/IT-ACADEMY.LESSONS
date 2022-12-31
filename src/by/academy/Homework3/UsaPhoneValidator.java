package by.academy.Homework3;

import java.util.regex.Pattern;

public class UsaPhoneValidator implements  Validator{
    public static String USA_PHONE_PATTERN = "\\+1(\\d{9})";
    @Override
    public Pattern getPattern() {
        return Pattern.compile(USA_PHONE_PATTERN);
    }
}
