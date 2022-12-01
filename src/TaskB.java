import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doubleletter = false;
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; ++i){
            int n = sc.nextInt();
            String yes = "YES";
            String no = "NO";
            String res = yes;
            doubleletter = false;
            String s = sc.next();
            char[] ss = s.toCharArray();
            int index = 0;
            while (index < s.length() - 1 && index < n - 1){
              if (doubleletter){
                  if (ss[index] != ss[index+1] || index == s.length() - 2){
                      res = no;
                      break;
                  }
                  index += 2;

              } else {
                  index++;

              }
                doubleletter = !doubleletter;
            }
            System.out.println(res);
        }
    }
}
