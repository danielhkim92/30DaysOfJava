package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i <array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
	// write your code here

        //3 ways of initiating an array
        //declaring
        int[] intArray1;
        ////allocating
        int[] intArray2 = new int[4];
        printArray(intArray2);
        ////initializing
        int[] intArray3 = {5, 2, 9, 1 , 3};
        ////S
        String[] shoppingList =  {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray3[2] = 5;
        intArray2[3] = 10;

        // print out arrays
        System.out.println(Arrays.toString(intArray2));

        ///custom print out arrays
        printArray(intArray2);
        printArray(intArray3);

        ///retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));

        /* /given functions */
        Arrays.sort(intArray3);
        printArray(intArray3);

        System.out.println("special for loop for shopping list");
        ///special for loop; for each
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
