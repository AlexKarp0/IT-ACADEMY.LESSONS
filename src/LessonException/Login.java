package LessonException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    private static final Pattern VALIDATION_PATTERN = Pattern.compile("[a-zA-Z_0-9]{5,20}");

    public static void main(String[] args) {
        try {

            System.out.println(checkLogin("ALe88x", "nbkbvbkbnhzvlbz", "nbkbvbkbnhzvlbz0"));
        } catch (WrongPasswordException | WrongLoginException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finish");
        }
    }

    public static boolean checkLogin(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Matcher matcher = VALIDATION_PATTERN.matcher(login);
        if (!matcher.matches()) {
            throw new WrongLoginException("Wrong Login");
        }
        Matcher matcherPassword = VALIDATION_PATTERN.matcher(password);

        if (!matcherPassword.matches() || !password.equals(confirmPassword))
            throw new WrongPasswordException("Wrong passowrd");
        return true;
    }
}
