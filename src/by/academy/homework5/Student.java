package by.academy.homework5;

public class Student {
    private double grade;
    private  String name;

    public Student() {
        super();
    }

    public Student(double grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student is {" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
