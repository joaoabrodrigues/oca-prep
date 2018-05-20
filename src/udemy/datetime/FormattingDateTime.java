package udemy.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortFormat.format(dateTime));
        System.out.println(mediumFormat.format(date));
        // System.out.println(shortFormat.format(time)); runtime exception UnsupportedTemporalTypeException

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(formatter));

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        System.out.println(sdf.format(new Date()));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dateTime.format(dtf));
        System.out.println(dtf.format(time));
        System.out.println(date.format(dtf)); // throws exception UnsupportedTemporalTypeException
    }
}
