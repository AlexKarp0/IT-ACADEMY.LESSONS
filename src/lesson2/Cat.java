package lesson2;

public class Cat {
    int age;
    String nickname;
    double money;
    char initials;
    boolean isHomeAnimal;

    public Cat(String nickName) {
        this.nickname = nickName;
    }

    public Cat() {

    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }

    public void spendMoney(double money) {
        this.money -= money;
    }

    public void sleep() {
        System.out.println("Cat " + nickname + " sleep");
    }

    public void eat() {
        System.out.println("Cat " + nickname + " eat");
    }

    public void walk() {
        System.out.println("Cat " + nickname + " walk");
    }

    public void grow() {
        age++;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        setInitials(nickname.toUpperCase().toCharArray()[0]);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
