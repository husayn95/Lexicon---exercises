package LexiconJava.Exercises.ExercisesWeek1;

public class areacalculator {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args){

        char newChar = 'f';
        switch (newChar){
            case 1:
                System.out.println("A was found");
                break;
            case 2:
                System.out.println("B was found");
                break;
            case 3:
                System.out.println("C was found");
                break;
            case 4:

        }


    }


    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }
}
