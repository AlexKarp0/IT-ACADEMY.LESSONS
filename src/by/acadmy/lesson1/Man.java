package by.acadmy.lesson1;

public class Man {
    public void setAge(int age) {
        this.age = age;
    }

    public Man(int age) {
        super();
        this.age = age;
    }
    public Man() {
        super();
    }

    int age;
    public void grow(){
        age += 1;
    }
    public int getAge(){
        return age;
    }
}
