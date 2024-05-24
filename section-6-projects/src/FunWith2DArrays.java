// Regular built-in Arrays are 1 dimensional (1D)
// You can have multi-dimensional Arrays

// Two-dimensional Array
// Have two sets of square brackets. Most commonly [row] and [col]
// myArray[row][col];

// 2D arrays are often called matrices
// A generalisation (2+ dimensions) of a matrix is called a tensor - just for reference.

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        // 2 row x 3 column
        int[][] myNew2DArray = new int[2][3]; // 2 row, 3 columns.

        fill2DArray(myNew2DArray);
        print2DArray(myNew2DArray);

        twice2DArray(myNew2DArray);
        print2DArray(myNew2DArray);
    } // end main method

    public static void fill2DArray(int[][] twoDArray) {
        Random rand = new Random();

        // regular for loop
        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++) {
                // randomise 0 - 99 inclusive
                // row i, col j
                twoDArray[i][j] = rand.nextInt(100); // 0 ..99 inclusive.
            } // end inner for loop
        } // end regular for loop
    } // end fill2DArray method

    public static void print2DArray(int[][] twoDArray) {
        // enhanced for loop
        for(int[] arr : twoDArray) {
            for(int num : arr) {
                System.out.print(num + " ");
            } // end inner for loop
            System.out.println(); // just prints a blank new line for spacing.
        }
    } // end print2DArray method

    public static void twice2DArray(int[][] twoDArray) {
        // regular for loop
        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++) {
                // randomise 0 - 99 inclusive
                // row i, col j
                twoDArray[i][j] *= 2; // 0 ..99 inclusive.
                // same as twoDArray[i][j] = twoDArray[i][j] * 2;
            } // end inner for loop
        } // end regular for loop
    } // end twice2DArray method
}
