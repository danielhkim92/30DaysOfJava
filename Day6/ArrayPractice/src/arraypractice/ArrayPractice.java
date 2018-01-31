package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
	// write your code here

        //3 ways of initiating an array
        //declaring
        int[] intArray1;
        ////allocating
        int[] intArray2 = new int[4];
        ////initializing
        int[] intArray3 = {5, 2, 9, 1 , 3};
        ////S
        String[] stringArray1 =  {"bananas", "apples", "pears"};

        System.out.println(Arrays.toString(intArray2));
    }
}
