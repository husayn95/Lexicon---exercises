package LexiconJava.Exercises.ExercisesWeek1;

import java.util.Random;
import java.util.Scanner;

/* Write a program that first generates a random number between 1 and 500 and stores it into a variable (see the Random class).
Then let the user make a guess for which number it is. If the user types the correct number,
he should be presented with a message (including the number of guesses he has made).
If he types a number that is greater or smaller than the given number, display either “Your guess was too small” or “Your guess was too big”.
The program should keep executing until the user input the correct guess.*/
public class RandomNumber {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int x = 1+ randomNumber.nextInt(500);
        System.out.println(x);
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the random number!");
        int guessNumber = 0;
        int countGuesses =1;

                while (guessNumber != x){
        guessNumber = input.nextInt();

         if (guessNumber < x)
            System.out.println("Your guess was too small. Try Again!");
        else if (guessNumber > x){
            System.out.println("Your guess was too big. Try Again!");}
        else
            System.out.println("You guessed the right number at your " + countGuesses + "th guess!");
        countGuesses++;
    }}
}
