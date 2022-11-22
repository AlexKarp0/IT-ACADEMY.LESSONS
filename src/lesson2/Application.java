package lesson2;

public class Application {
    public static void main(String[] args){
        Cat cat1 = new Cat("Cat with name");
        cat1.eat();
        cat1.sleep();
        cat1.walk();

        Cat cat2 = new Cat();
        cat2.grow();
        cat2.grow();
        cat2.grow();
        System.out.println(cat2.getAge());
        cat2.setIsHomeAnimal(true);
        System.out.println(cat2.isHomeAnimal());
        cat2.setInitials('F');
        System.out.println(cat2.getInitials());
        cat2.setMoney(123.0 / 5);
        System.out.println(cat2.getMoney());
        cat2.spendMoney(5);
        System.out.println(cat2.getMoney());
        cat2.setNickname("vasya");
        System.out.println(cat2.getInitials());
    }
}
