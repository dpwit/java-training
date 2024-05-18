// Wrapper classes
// Same as the 8 primitive types, only start with CAPS and Integer (int) and Character (char) are spelt in full
// Byte, Short, Integer, Long
// Float, Double
// Character, Boolean

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> myNewArrayList = new ArrayList<>();

        //myNewArrayList.add(new Integer(10)); We could do it like this, and it works, although Integer is underlined as an error
        //myNewArrayList.add(new Integer(20));

        // this is better and known as auto boxing...

        myNewArrayList.add(10); // the reference type Integer knows it an integer, only works with Wrapper classes!
        myNewArrayList.add(20);

        for(int i = 0; i < myNewArrayList.size(); i++ ) {
            System.out.println(myNewArrayList.get(i));
        } //end for

        // another cool String and int example...

        String numValue = "100";
        int numericValue = Integer.parseInt(numValue);
        numericValue += 10;

        System.out.println(numericValue);

        //another cool String and double example...

        String doubleStringValue = "3.14159";
        double doubleNumericValue = Double.parseDouble(doubleStringValue);
        doubleNumericValue += 3.14159;

        System.out.println(doubleNumericValue);

    } // end main
}
