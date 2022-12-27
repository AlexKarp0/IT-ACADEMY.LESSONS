package LessonDates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(1992,6,9);
//        LocalDate sysdate = LocalDate.now();
//        LocalDate newDate=  sysdate.minusYears(31);
//        System.out.println(newDate);
//        System.out.println("Is by BD before " + date.isBefore(newDate));
//
//        System.out.println("I was born " + date.getDayOfWeek() +" it was " + date.getDayOfYear()+"'s day of "+ date.getYear() + " YEAR " );
//        LocalDate[] holidays = {LocalDate.of(2023,1,1),LocalDate.of(2023,1,2),LocalDate.of(2023,1,7),
//                LocalDate.of(2023,3,8),LocalDate.of(2023,4,25),LocalDate.of(2023,5,1),LocalDate.of(2023,5,9)};
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        for (LocalDate holiday : holidays) {
//            System.out.println(holiday.format(formatter));
//        }
        TimeOfYear time = TimeOfYear.SPRING;

        System.out.println(time);
        test(TimeOfYear.WINTER);
    }

    public static void test(TimeOfYear time) {
        switch (time){
            case AUTUMN :
                System.out.println("I hate " + time);
                break;
            case SUMMER:
                System.out.println("I enjoy " + time);
                break;
            default:
                System.out.println("OU");;
        }
    }
}
