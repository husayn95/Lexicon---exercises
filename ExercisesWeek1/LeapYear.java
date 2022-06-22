package LexiconJava.Exercises.ExercisesWeek1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Write a year: " );
        int yearInput = input.nextInt();
        if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) //Checks if it's leap year or not
            System.out.println(yearInput + " is a leap year!");
        else System.out.println(yearInput + " is not a leap year!");
    }
}
