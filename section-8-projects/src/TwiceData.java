import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TwiceData {
    public static void main(String[] args) {
        Scanner infile;
        PrintWriter pw;

        try {
            infile = new Scanner(new File("nums.txt"));

            pw = new PrintWriter("twice_nums.txt");

            int nums;
            int numsDouble = 0;

            while(infile.hasNext()) {
                nums = infile.nextInt();
                numsDouble = nums * 2;
                pw.println(numsDouble);

            } // end while loop


                infile.close();
                pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found!");
            System.out.println(ex.getMessage());
        }

        catch(InputMismatchException ex) {
            System.out.println("Error in the input file, entry is not a number!");
        } // end try-catch


    } // end main method
} // end TwiceData class
