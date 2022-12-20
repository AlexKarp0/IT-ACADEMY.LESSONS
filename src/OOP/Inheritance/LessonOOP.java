package OOP.Inheritance;

public class LessonOOP {
    public static void main(String[] args) {
        Product product = new Product("Milk",0.01,5);
        Wine vine = new Wine("Red");
        Cheese cheese = new Cheese("Hohland",2.5,1,1);
        System.out.println(product.toString());
        System.out.println(vine.toString());
        System.out.println(cheese.toString());
        Product product2 =  new Wine("red vine",0.50,2,"red");
        System.out.println(product2.toString());
        Champain champain = new Champain("prosecco",10,1,"white",10);
        System.out.println(champain.toString());
    }
}
