package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    static Pattern pattern = Pattern.compile("[\\w\\!]+");
    public static void main(String[] args) {
        String s = " Hey      There!     How      Are you doing";
        String res ="";
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            res = res + matcher.group() + " ";
        }
        System.out.println(res);
    }


}
