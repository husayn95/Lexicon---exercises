package LexiconJava.Exercises.ExercisesWeek2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 4, 5, 6};

        for (int printArray : array){
            System.out.print(printArray + " ");
        }

        //indexOf method
        System.out.println("\nIndex position of number 3"  +  " is: " + indexOf(array, 3) );


        //3. Write a program which will sort string array.
        //Expected output: String array: [Paris, London, New York, Stockholm]
        //Sort string array: [London, New York, Paris, Stockholm]
        String[] cities = {"London", "Paris", "Los Angeles", "Kalmar", "Stockholm"};
        System.out.print("String array: ");
        for (String sortString : cities) {
            System.out.print(sortString + ", ");
        }

        //4. Write a program which will copy the elements of one array into another array.
        //Expected output: Elements from first array: 1 15 20
        //Elements from second array: 1 15 20
        int[] arrayFirst = {1,2,3,4,5,6};
        int[] arraySecond = new int[6];
        for ( int i = 0; i < arrayFirst.length; i++){
                arraySecond[i] =  arrayFirst[i];

        }            System.out.println("\nThe second array after copying: " + Arrays.toString(arraySecond));



        //6) Write a program which will set up an array to hold the next values in
        // this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        // Expected output: Average is: 17.3
        int[] arr = {43, 5, 23, 17, 2, 14};
        double average = 0;
        double sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println("The average of the numbers in the array arr is: " + average);
    }








    public static int indexOf(int[] arrayElements, int indexValue){
       // int[] array = new int[9];
        for (int i = 0; i < arrayElements.length; i++)
            if (arrayElements[i] == indexValue)
                return i;
        else
            i = i +1; // else go to next

            return -1; // else return -1

    }

}
