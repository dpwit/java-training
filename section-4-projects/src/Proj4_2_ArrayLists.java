import java.util.Scanner; // needed to accept keyboard entries
import java.util.ArrayList; // needed to create an ArrayList

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {

        ArrayList<Double> myDoubleArrayList = new ArrayList<>(); // create ArrayList to accept 'Double' data types ie numbers with decimals.
        Scanner keyboard = new Scanner(System.in);

        double input; // variable for the Double input

        // priming read
        System.out.println("Please enter any number from 0 to add it to the list. Or just -1 to exit");
        input = keyboard.nextDouble();

        while(input >= 0) {
            myDoubleArrayList.add(input);
            System.out.println("Please enter another number from 0 to add it to the list. Or just -1 to exit");
            input = keyboard.nextDouble();
        } // end while loop

        // for loop
        for(int i = myDoubleArrayList.size() -1; i >= 0; i--) { // outputs the list in reverse order
            System.out.println(myDoubleArrayList.get(i));
        } // end for loop

        // enhanced for loop
        for(Double values : myDoubleArrayList) { // this one prints in order, enhanced for loop doesn't support reverse ordering - use just for loop - as above.
            System.out.println(values);
        };

    } // end main
}
