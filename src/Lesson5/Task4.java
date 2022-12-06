package Lesson5;

import java.util.Scanner;

public class Task4 {
    public  static int getUniqueCount(String s){
        int res = 0;
        for (int i = 0; i < s.length();i++){
            if (s.indexOf(s.charAt(i),i+1)==-1){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int maxUnique = Integer.MIN_VALUE;
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter string number " + (i + 1));
            String s = sc.next();
            if (getUniqueCount(s) > maxUnique){
                maxUnique = getUniqueCount(s);
                res = s;
            }

        }
        System.out.println(res + " ; Unique count is " + maxUnique);
    }
}
