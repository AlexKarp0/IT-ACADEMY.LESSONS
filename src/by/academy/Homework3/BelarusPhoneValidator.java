package by.academy.Homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    public static String PHONE_PATTERN ="\\+375(33||25|29|44)(\\d{7})";
    @Override
    public Pattern getPattern() {
        return Pattern.compile(PHONE_PATTERN);
    }


}
