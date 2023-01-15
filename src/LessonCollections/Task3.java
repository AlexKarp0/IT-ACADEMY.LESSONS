package LessonCollections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter count");
        int count = scanner.nextInt();
        Set<Integer> unique = new HashSet<Integer>();
        for (int i = 0; i < count; i++) {
            unique.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(Arrays.toString( unique.toArray()));
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(3);
        hs1.add(2);
        hs1.add(4);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(5);
        hs2.add(2);

        HashSet<Integer> hs3 = new HashSet<>();
        hs3.add(1);
        hs3.add(6);
        hs3.add(2);
        HashSet<Integer> res = union(hs1,hs2,hs3);
        System.out.println("Result  union is");
        System.out.println(Arrays.toString(res.toArray()));
        HashSet<Integer> resIntersect = intersect(hs1,hs2,hs3);
        System.out.println("Result  union is");
        System.out.println(Arrays.toString(resIntersect.toArray()));
    }
    public static <T>HashSet union(Set<T>... set){
        HashSet<T> res = new HashSet<T>();
        for (Set<T> objects : set) {
            for (T element : objects) {
                res.add(element);
            }
        }
        return  res;
    }

    public static <T>HashSet intersect(Set<T>... set){
        HashSet<T> res = new HashSet<T>();
        boolean isFirst = true;
        for (Set<T> objects : set) {
            if (isFirst){
                for (T object : objects) {
                    res.add(object);
                }
                isFirst = false;
            }
            else
                res.retainAll(objects);
        }
        return  res;
    }
}
