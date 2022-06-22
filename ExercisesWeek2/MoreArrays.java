package LexiconJava.Exercises.ExercisesWeek2;

import java.util.Arrays;

public class MoreArrays {
    public static void main(String[] args) {

        //5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
        // Expected output: France Paris
        //Sweden Stockholm
        String[][] twoDimensional = new String[2][2];
        twoDimensional[0][0]  = "Sweden";
        twoDimensional[0][1] = "Stockholm;";
        twoDimensional[1][0] = "England";
        twoDimensional[1][1] = "London";
        System.out.println(Arrays.deepToString(twoDimensional));


        //7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
        // Expected output: Array: 1 2 4 7 9 12
        //Odd Array: 1 7 9
        int[] tenNumbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i =0; i < tenNumbers.length; i++){
            if(tenNumbers[i] % 2 != 0){   //if the remainder divided with 2 (an equal number) is not zero, then its odd number
                System.out.println(tenNumbers[i]);
            }
        }



        //8. Write a program which will remove the duplicate elements of a given array
        // [20, 20, 40, 20, 30, 40, 50, 60, 50].
        // Expected output: Array: 20 20 40 20 30 40 50 60 50
        //Array without duplicate values: 20 40 30 50 60
        int[] givenArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        for (int i =0; i < givenArray.length; i++){
            if(givenArray[i] == givenArray[i]+1)
                givenArray[i] = 0;
            else continue;
        }
        System.out.println("Givenarray: "+Arrays.toString(givenArray));
        Arrays.sort(givenArray); // first lets sort it
        for (int arr : givenArray){
            System.out.println(arr);
        }




       // 9. Write a method which will add elements in an array. Remember that arrays are fixed in size
        // so you need to come up with a solution to “expand” the array.
        int[] array = new int[5];
        int[] newArray = Arrays.copyOf(array, array.length +1);
        System.out.println(Arrays.toString(array));
        System.out.println("The new extended array: " +Arrays.toString(newArray));

    }
}
