import java.util.Random;

public class DiceSimulation {
    public static void  main(String[] args) {
        Random diceRolls = new Random();
        int score;

        // for loop
        for(int i = 0; i < 10; i++) {
            score = diceRolls.nextInt(6) + 1; //limits random number between 1-6. Shifts the number from 0 by 1
            System.out.println(i + " Your dice score is: \t" + score);
        } // end for loop

        //System.out.print("Your dice score is: \t" + score);

    } // end main
}

