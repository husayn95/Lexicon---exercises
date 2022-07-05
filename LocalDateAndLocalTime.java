package LexiconJava.Exercises.ExercisesWeek3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateAndLocalTime {
    public static void main(String[] args) {

        //Exercise 1:
        //Create a LocalDate of the current day and print it out
        LocalDate todaysDate = LocalDate.now();
        System.out.println("Exercise 1: Todays date is: " + todaysDate);


        //Exercise2:
        //Create a LocalDate of the current day and print it out in the following pattern
        // using DateTimeFormatter: Torsdag 29 mars.
        String formatte = todaysDate.format(DateTimeFormatter.ofPattern("EEEE dd MMM"));
        System.out.println("Exercise 2: "+formatte.toUpperCase(Locale.ROOT));



        //Exercise3:
        //Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
        LocalDate fromMonday = LocalDate.of(2022,06,27);
        DayOfWeek monday = fromMonday.getDayOfWeek();
        System.out.println("Exercise 3: Not Done yet!"+monday);


      //  Exercise 4:
     //   Create a LocalDate object from a String by using the .parse() method.
        LocalDate parse = LocalDate.parse("2022-06-30");
        System.out.println("Exercise 4: "+parse);


        //Exercise5
        //The date time api provides enums for time units such as day and month.
        // Create a LocalDate of 1945-05-08 and extract the day of week for that date.
        LocalDate dayAndMonthOf = LocalDate.parse("1945-05-08");
        DayOfWeek dayOfWeek = dayAndMonthOf.getDayOfWeek();
        System.out.println("Exercise 5: "+dayOfWeek);


        //Exercise6
        //Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.
        LocalDate plusAndMinus = todaysDate.plusYears(10).minusMonths(10);
        Month theMonth = plusAndMinus.getMonth();
        System.out.println("Exercise 6: "+theMonth);
        System.out.println(plusAndMinus);



        //Exercise7
        //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 5.
        // Print out the elapsed years, months and days.
        LocalDate myBirthdate = LocalDate.of(1995,05,04);
        Period period = Period.between(myBirthdate, todaysDate);
        System.out.println(myBirthdate.isLeapYear());
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Exercise 7: "+years + " years , " + months + " months , " + days + " days");




        //Exercise 8
        //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date
        // and add the period you created to the current date.
        LocalDate addedPeriod = todaysDate.plusYears(4).plusMonths(7).plusDays(29);
        System.out.println("Exercise 8: "+addedPeriod);


        //Exercise 9
        //Create a LocalTime object of the current time.
        LocalTime currentTime = LocalTime.now();
        System.out.println("Exercise 9: " + currentTime.truncatedTo(ChronoUnit.SECONDS)); //skips milliseconds when printing



        //Exercise 10
        //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        int nanosecondsExtracted = currentTime.getNano();
        System.out.println("Exercise 10: "+ nanosecondsExtracted);


        //Exercise 11
        //Create a LocalTime object from a String using the .parse() method.
        LocalTime parseTime = LocalTime.parse("15:02:05");
        System.out.println("Exercise 11: "+parseTime);


        //Exercise 12
        //Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
        //10:32:53
        String custom = parseTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("Exercise 12: " + custom);


        //Exercise 13
        //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
        LocalDateTime localDateTime = LocalDateTime.parse("2020-01-03T17:00");
        System.out.println("Exercise 13: " + localDateTime);

        //Exercise 14
        //Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String
        // that should look tile this: torsdag 5 april 10:00
        System.out.println("Exercise 14: "+ localDateTime.format(DateTimeFormatter.ofPattern("eeee dd MMMM k:mm")));

        //Exercise 15
        //Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        LocalDateTime dateAndTimeCombined = LocalDateTime.of(todaysDate, currentTime);
        System.out.println("Exercise 15: " + dateAndTimeCombined.truncatedTo(ChronoUnit.MINUTES));


        //Exercise 16
        //Create a LocalDateTime object. Then get the LocalDate and LocalTime components into
        // separate objects of respective types from the LocalDateTime object.
        LocalDate extractedFrom = localDateTime.toLocalDate();
        LocalTime localTimeExtractedFrom = localDateTime.toLocalTime();
        System.out.println("Exercise 16: " + extractedFrom + " is seperated from " + localTimeExtractedFrom);


        //Extra assignment
        //Create your own calendar for the year 2018.


    }
}
