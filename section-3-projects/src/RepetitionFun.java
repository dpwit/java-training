import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int input = 0;

        System.out.println("Please enter a non-negative integer...");
        System.out.println("Enter a negative integer to exit!");

        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);

            System.out.println("Please enter a non-negative integer,");
            System.out.println("or enter a negative integer to exit!");

            input = keyboard.nextInt();
        } // end while loop

        System.out.println("You're finished!");

        //while loop
//        int count = 0;
//
//        while(count < 10) {
//            System.out.println(count);
//            count++;
//        }

        // do while loop
//        int count = 0;
//
//        do {
//            System.out.println(count);
//            count++;
//        }
//
//        while(count < 10);

        // for loop
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        } // end for loop

        // all three examples in this instance gives the same end result.

    } // end main
}
