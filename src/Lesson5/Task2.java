package Lesson5;

public class Task2 {
    public static void main(String[] args) {
        String s = "SДля работы со строками в языке Java используются классы String,"
                + " StringBuilder, StringBuffer";
        int index = -1;
        //System.out.println(s.indexOf("S",57));
        do {
            index = s.indexOf("S",index +1);
            if (index != -1) {
                System.out.print(index + " ");
            }
        } while (index != -1);
    }
}
