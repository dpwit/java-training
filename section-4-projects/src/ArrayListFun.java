// arrays are fixed once set.
// ArrayList(s) can grow in size and can re-size.
// ArrayList is from java.util

// use 'add' to add elements and 'get' to get elements

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList; // ArrayList can only be reference types like String. You can't uae an int in ArrayList
        namesList = new ArrayList<>(); // we don't need to specify a size of the array for ArrayList, unlike array, as ArrayList can resize!

        ArrayList<int> myNamesList = new ArrayList<int>(); // You can't use an int primitive type in an ArrayList (see the error), only reference types like String

        // We will see a good work-around in the next lesson - see that!

        namesList.add("Darren");
        namesList.add("Jules");
        namesList.add("Kate");
        namesList.add("John");

        //for loop - loops through array
//        for(int i = 0; i < namesList.size(); i++) {
//            System.out.println(namesList.get(i));
//        }

        // enhanced for loop
        for(String name : namesList) {
            System.out.println(name);
        };

    } //end main
}
