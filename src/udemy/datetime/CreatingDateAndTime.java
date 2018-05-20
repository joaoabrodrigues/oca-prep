package udemy.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {

    // All Immutable
    // LocalDate
    // LocalTime
    // LocalDateTime
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2018, Month.MAY, 20);
        LocalTime time = LocalTime.of(10, 30);

        System.out.println();

        System.out.println(date);
        System.out.println(time);
        System.out.println(LocalDateTime.of(date, time));

        System.out.println();

        // before java 8
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.JANUARY, 1);
        Date jan = calendar.getTime();
        System.out.println(jan);
    }
}
