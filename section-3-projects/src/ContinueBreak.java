import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int count = 0;

        while(count < 10) {

            if (count == 5) {
                count++; // this stops the infinite loop. Only needed for continue, not required for break.
                //continue; // checks if OK and continues.
                break; // breaks out of loop and stops
            }

            System.out.print(count + "\t");

            count++; // this stops the infinite loop.
        } // end while

    } // end main
}
