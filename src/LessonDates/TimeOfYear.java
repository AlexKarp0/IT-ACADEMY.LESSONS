package LessonDates;

public enum TimeOfYear {

    WINTER(-5,"COLD"), SPRING(15,"WET"), SUMMER(25,"HOT"), AUTUMN(5,"RAINY") ;
    double temperature;
    String desc;
    TimeOfYear(double temperature, String desc) {
        this.temperature = temperature;
        this.desc = desc;
    }

    TimeOfYear(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "TimeOfYear{" +
                "temperature=" + temperature +
                ", desc='" + desc + '\'' +
                '}';
    }
}
