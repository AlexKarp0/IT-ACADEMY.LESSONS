package by.academy.homework5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Object> integerArrayListWithDuplicate = new ArrayList<Object>(Arrays.asList(1,2,3,4,5));
        integerArrayListWithDuplicate.addAll(integerArrayListWithDuplicate);
        System.out.println("before");
        System.out.println(Arrays.toString(integerArrayListWithDuplicate.toArray()));

        HashSet<Object> a = unique(integerArrayListWithDuplicate);
        System.out.println("after");
        System.out.println(Arrays.toString(a.toArray()));

    }
    public  static  HashSet<Object> unique(Collection<Object> collection){
        HashSet<Object> res = new HashSet<Object>();
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            res.add(iterator.next());
        }
        return res;
    }
}
