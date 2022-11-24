package lesson3;

public class Task5 {
    public static void main(String[] args) {
        int seconds = 24  // 24 sec
                + 20*60     // 20 min
                + 3600      //hour
                + 24 * 3600 * 3 // 3 day
                + 7 * 24 * 3600 * 2; // 2 week
        final int secInMin = 60;
        final int minInHour = 60;
        final int hourInDay = 24;
        final int dayInWeek = 7;

        int sec = seconds % secInMin;
        int min = seconds % (secInMin * minInHour) / minInHour;
        int hour = (seconds % (secInMin * minInHour * hourInDay)) / (minInHour * minInHour);
        int day = (seconds % (secInMin * minInHour * hourInDay * dayInWeek)) / (secInMin * minInHour * hourInDay);
        int week = seconds / (secInMin * minInHour * hourInDay * dayInWeek);
        System.out.println(week + " week " + day + " day " + hour + ":" + min + ":" + sec);

    }
}
