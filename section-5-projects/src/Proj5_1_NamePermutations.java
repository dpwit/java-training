import java.util.Scanner;
import java.util.ArrayList;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNameArray = new ArrayList<>();
        ArrayList<String> lastNameArray = new ArrayList<>();

        String fullNameString;
        String firstNameString;
        String lastNameString;

        // for loop
        for(int i = 0; i < 5; i++) {
            System.out.print("Please enter full name " + i + "\t") ;
            fullNameString = keyboard.nextLine();

            int indexOfSpace = fullNameString.indexOf(" ");

            firstNameString = fullNameString.substring(0, indexOfSpace);

            lastNameString = fullNameString.substring(indexOfSpace + 1);

            firstNameArray.add(firstNameString);
            lastNameArray.add(lastNameString);

        } // end for

        // this was the only bit I needed help with!

        // now for the permutation part...
        for(int i = 0; i < firstNameArray.size(); i++) {
            // System.out.println(firstNameArray.get(i) + " " + lastNameArray.get(i));
            for(int j = 0; j < lastNameArray.size(); j++) {
                System.out.println(firstNameArray.get(i) + " " + lastNameArray.get(j));
            } // end for j

        } // end for i

    } // end main
}
