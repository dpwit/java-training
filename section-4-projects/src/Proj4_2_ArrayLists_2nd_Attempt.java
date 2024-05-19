import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_2_ArrayLists_2nd_Attempt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        ArrayList<Double> myDoubleList = new ArrayList<>();

        double inputDouble; // create double variable for number input for Double ArrayList

        // priming read
        System.out.println("Please enter any number from 0 or type -1 to exit...");
        inputDouble = keyboard.nextDouble();

        while(inputDouble >= 0) {
            myDoubleList.add(inputDouble);
            System.out.println("Please enter another number from 0 or type -1 to exit...");
            inputDouble = keyboard.nextDouble();
        } // end while

        for(int i = myDoubleList.size() -1; i >= 0; i--) { // outputs in reverse order
            System.out.println(myDoubleList.get(i));
        }

    } //end main
}

// completed with no help!
