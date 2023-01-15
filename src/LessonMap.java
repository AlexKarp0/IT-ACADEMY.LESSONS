import by.academy.Homework3.Champagne;
import by.academy.Homework3.Cheese;
import by.academy.Homework3.Product;

import java.util.*;
import java.util.Map.Entry;

/*
8.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов  - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.

* */
public class LessonMap {
    public static void main(String[] args) {
        HashMap<String, Product> productHashMap = new HashMap<>();
        Product product1 = new Cheese(11,234,2);
        product1.setName("NAME1");
        Product product2 = new Champagne("white",10);
        product2.setName("NAME2");

        Map<String,Product> productMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        ArrayList<Product> products = new ArrayList<>(Set.of(product1,product2)) ;
        for (Product product : products) {
            productHashMap.put(product.getName(),product);
            productMap.put(product.getName(),product);
        }

        printEntry(productHashMap);
        printKey(productHashMap);
        printValue(productHashMap);

        System.out.println("TreeMap");
        printEntry(productMap);
        printKey(productMap);
        printValue(productMap);


    }
    public static void printEntry(Map<String,Product> productHashMap){
        System.out.println("Entry Set");
        for (Entry <String,Product> entry : productHashMap.entrySet()){
            System.out.println(entry.getKey() + " + "+ entry.getValue().toString());
        }
    }
    public static void  printKey(Map<String,Product> productHashMap){
        System.out.println("Key set");
        for (String key : productHashMap.keySet()){
            System.out.println(key);
        }
    }
    public static void printValue(Map<String,Product> productHashMap){
        System.out.println("Values");
        for (Product product: productHashMap.values()){
            System.out.println(product.toString());
        }
    }
}
