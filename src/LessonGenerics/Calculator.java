package LessonGenerics;

public  class Calculator {
    public static <T extends  Number,V extends Number> double sum ( T first, V second){
        return first.doubleValue() + second.doubleValue();
    }
    public static <T extends  Number,V extends Number> double multiply ( T first, V second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends  Number,V extends Number> double divide ( T first, V second) {
        return first.doubleValue() / second.doubleValue();
    }
    public static <T extends  Number,V extends Number> double subtraction ( T first, V second) {
        return first.doubleValue() - second.doubleValue();
    }


}
