import java.util.Scanner;
import java.util.Random;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        // create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // create a Random object to generate random numbers
        Random randomNum = new Random();

        // generate an integer between 1 and 100
        int randomNumber = randomNum.nextInt(100) +1 ;

        // variable to store user's guess
        int guess = 0;

        // variable for number of attempts
        int attempts = 0;

        // game loop
        while(guess != randomNumber) {

            // prompt user for a guess
            System.out.print("Enter an integer between 1 and 100 to guess the number...\t");
            guess = keyboard.nextInt();
            attempts++;

            // check if the guess is correct
            if (guess < 1 || guess > 100) {
                System.out.println("That was a wasted guess! Choose a number between 1 and 100");
            } else if(guess > randomNumber){
                System.out.println("You're guess is too high! Try again");
            } else if(guess < randomNumber) {
                System.out.println("You're guess is too low! Try again");
            } else {
                System.out.println("Congratulations, you guess the correct number in " + attempts + " guesses. Thanks for playing!");
            }
        } // end while loop

    } // end main
}
