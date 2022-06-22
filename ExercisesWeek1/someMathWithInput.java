package LexiconJava.Exercises.ExercisesWeek1;

import java.util.Scanner;

//a program that asks user to input two numbers and
// print the sum/multiplication/division and subtraction of given numbers
public class someMathWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your two numbers: ");
        int firstInput = input.nextInt();
        int secondInput = input.nextInt();

        System.out.println(firstInput + " and " + secondInput);

        int multiplication = firstInput * secondInput;
        int division = firstInput / secondInput;
        int addition = firstInput + secondInput;
        int subtraction = firstInput - secondInput;
        System.out.println(firstInput + " * " + secondInput + " = " + multiplication);
        System.out.println(firstInput + " / " + secondInput + " = " + division);
        System.out.println(firstInput + " + " + secondInput + " = " + addition);
        System.out.println(firstInput + " - " + secondInput + " = " + subtraction);
    }
}
