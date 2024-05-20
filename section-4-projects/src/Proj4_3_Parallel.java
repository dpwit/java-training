// create two arrays
// one for name (String)
// one for age (int)
// join both together in output, ie, Darren is 54 years old

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> ageList  = new ArrayList<>();

        String nameInput;
        int ageInput;

        // for loop
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter a name...");
            nameInput = keyboard.nextLine();

            System.out.println("Please enter an age...");
            ageInput = keyboard.nextInt();

            // don;t forget
            keyboard.nextLine();

            namesList.add(nameInput);
            ageList.add(ageInput);
            System.out.println(); // just to add a line for spacing.

        } // end for

        for(int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i) + " is " + ageList.get(i) + " years old");
        }


    } // emd main
}
