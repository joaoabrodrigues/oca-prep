package udemy.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("20/05/2018", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);

        System.out.println();

        String text = date.format(formatter);
        System.out.println(text);

        System.out.println();

        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);

        System.out.println();

        LocalDate myDate = LocalDate.now();
        String dateString = formatter.format(myDate);
        System.out.println(dateString);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate = anotherDate.plusMonths(5).plusDays(5);
        System.out.println(formatter.format(anotherDate));
    }
}
