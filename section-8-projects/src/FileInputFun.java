// Exception is just a class
// You can have more than one Exception to catch different scenarios

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));
            int input;
            int inputSum = 0;

            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
                inputSum += input; // same as inputSum = inputSum + input.
            } // end while loop

            System.out.println("The sum of the numbers is: " + inputSum);

            infile.close();
        }
        catch(FileNotFoundException ex) { // handles the exception if the specified file is not found.
            System.out.println("Can't find the file you specified! :(");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex) {
            System.out.println("Error in the input file, entry is not a number!");
        } // end try-catch

    } // end main method
} // end FileInputFun class
