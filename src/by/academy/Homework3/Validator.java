package by.academy.Homework3;

import java.util.regex.Pattern;

public interface Validator {
    Pattern getPattern();
    default boolean validate(String s)
    {
        return  getPattern().matcher(s).matches();
    }
}
