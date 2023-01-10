package by.academy.Homework4;

import java.time.LocalDate;

public class CustomDate {
    private Year year;
    private Month month;
    private int day;
    Weekday weekday;
    public CustomDate(String stringDate) {
        int year  = Integer.parseInt(stringDate.substring(6, 10));
        int month = Integer.parseInt(stringDate.substring(3, 5));

        this.year = new Year(year);
        this.month = new Month(month);
        this.day = Integer.parseInt(stringDate.substring(0, 2));
        LocalDate date = LocalDate.of(year,month,day);
        switch (date.getDayOfWeek()){
            case MONDAY : weekday = Weekday.MONDAY;
                         break;
            case TUESDAY:  weekday = Weekday.TUESDAY;
                break;
            case WEDNESDAY : weekday = Weekday.WEDNESDAY;
                break;
            case  THURSDAY:  weekday = Weekday.THURSDAY;
                break;
            case FRIDAY:  weekday = Weekday.FRIDAY;
                break;
            case SATURDAY: weekday = Weekday.SATURDAY;
                break;
            case  SUNDAY: weekday = Weekday.SUNDAY;
                break;
            default: break;
        }

    }

    public class Year {
        int year;
        public Year() {
          super();
        }

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Year{" +
                    "year=" + year +
                    '}';
        }
    }
    public class Month {
        int month;
        public Month() {
            super();
        }

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        @Override
        public String toString() {
            return "Month{" +
                    "month= number " + month +
                    '}';
        }
    }

    public  enum Weekday {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private final String name;

        Weekday(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Weekday{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "year=" + year.toString() +
                ", month=" + month.toString() +
                ", day=" + day +
                ", weekday=" + weekday.toString() +
                ""+ weekday.name +" " + day + "/" + month.getMonth() + "/" + year.getYear() +
                '}';
    }
    public boolean isLeap(){
        LocalDate ld = LocalDate.of(year.year,month.month,day );
        return ld.isLeapYear();
    }
}
