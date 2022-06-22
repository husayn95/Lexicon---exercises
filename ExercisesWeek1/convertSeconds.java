package LexiconJava.Exercises.ExercisesWeek1;/* a program that converts seconds to hours, minutes and seconds
        Input seconds: 86399
        Expected output:
        23:59:59 */

public class convertSeconds {
    public static void main(String[] args) {
        int amountSeconds = 3666;
        int hour = (amountSeconds / 60) / 60; //get amount hours
        int minute = ((amountSeconds / 60) % 60); // amount minutes
        int second = (amountSeconds % 60); // "leftover" seconds
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
