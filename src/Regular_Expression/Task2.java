package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.
public class Task2 {
    static Pattern pattern = Pattern.compile("[\\w-]+");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// что-нибудь
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int res = 0;
        while (matcher.find()){
            res++;
        }
        System.out.println("Text have " + res + " words");
        scanner.close();
    }
}
