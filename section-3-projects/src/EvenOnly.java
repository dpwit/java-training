import java.util.Scanner;

public class EvenOnly {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int count = 0;

        while(count < 10) {

            if (count % 2 != 0) {
                count++; // this stops the infinite loop. Only needed for continue, not required for break.
                continue; // checks if OK and continues.

                //NB: continue and break where use in the GoTo old code! Some try to avoid it now, but can be useful.

            }

            System.out.print(count + "\t");

            count++; // this stops the infinite loop.
        } // end while

    } // end main
}
