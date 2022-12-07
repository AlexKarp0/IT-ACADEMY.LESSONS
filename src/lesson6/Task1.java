package lesson6;


//         a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//        b) Распечатать последний символ строки. Используем метод String.charAt().
//        c) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        d) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        e) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        f) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        g) Заменить все символы “а” на “о”.
//        h) Преобразуйте строку к верхнему регистру.
//        i) Преобразуйте строку к нижнему регистру.
//        j) Вырезать строку Java c помощью метода String.substring().
public class Task1 {
    public  static void a(String s){
        System.out.println(s);
    }
    public static char b (String s){
        return s.charAt(s.length()-1);
    }
    public static boolean c(String s){
        return s.endsWith("!!!");
    }
    public static boolean d(String s){
        return s.startsWith("I like");
    }
    static boolean e (String s){
        return s.contains("Java");
    }
    static int f (String s){
        return s.indexOf("Java");
    }
    static String g(String s){
        return new String(s.replace("a","o"));
    }
    static String h(String s){
        return s.toUpperCase();
    }
    static String i(String s){
        return s.toLowerCase();
    }
    static String j (String s){
        String substring = "Java";
        String res = s.substring(0,s.indexOf(substring)) + s.substring(s.indexOf(substring)+substring.length());
        return res;
    }
    public static void main(String[] args) {
        String s ="I like Java!!!";
        System.out.println("b  " + b(s));
        System.out.println("c  " + c(s));
        System.out.println("d  " + d(s));
        System.out.println("e  " + e(s));
        System.out.println("f  " + f(s));
        System.out.println("g  " + g(s));
        System.out.println("h  " + h(s));
        System.out.println("i  " + i(s));
        System.out.println("j  " + j(s));
    }

}
