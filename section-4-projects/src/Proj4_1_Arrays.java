// prompt the user to enter 5 integer values and then double value and print out the results.

import java.util.Scanner; // needed for keyboard input

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5]; // creates an array of 5 elements

        Scanner keyboard = new Scanner(System.in);

        // for loop - stores the values from the keyboard entries
        for(int i = 0; i < myArray.length; i++) {
            System.out.print("Please enter an integer...\t");
            myArray[i] = keyboard.nextInt();
        } // end for

       // for loop to restore the value and * by 2 and prints out
        for(int i = 0; i < myArray.length; i++) {
//            int result = myArray[i] * 2; // you can you this method, which may be easier to understand.
//            System.out.println(result);
            System.out.println(myArray[i] * 2); // this is a cleaner code method - which makes sense to me.
        }

    } //end main
}
