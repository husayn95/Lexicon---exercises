package LexiconJava.Exercises.ExercisesWeek1;

// a Java program to print the sum/multiplication/division and subtraction of two numbers
public class someMath {
    public static void main(String[] args) {

        System.out.println("The results are: " );
        sum(3,2);

    }

    public static void sum(int firstNumber, int secondNumber){
    int multiplication = firstNumber * secondNumber;
    int division = firstNumber / secondNumber;
    int addition = firstNumber + secondNumber;
    int subtraction = firstNumber - secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);




    }

}
