package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 12. (lesson 6)
//
//        Предложение состоит из нескольких слов, разделенных пробелами.
//        Например: "One two three раз два три one1 two2 123 ".
//        Найти количество слов, содержащих только символы латинского алфавита.
public class Task12 {
    //static Pattern pattern = Pattern.compile("[a-zA-Z[\\D]");
    public static void main(String[] args) {
        String s = "One two three раз два три one1 two2 123 ";
        String[] arr =s.split(" ");
        int res = 0;
        for (String s1 : arr) {
            //System.out.println(s1);
            if (s1.matches("[a-zA-Z]+")) {
                System.out.print(s1 + " ");
                res++;
            }
        }
        System.out.println();
        System.out.println(res);
    }
}
