// data structure is a collection of elements
// arrays are just data structures
// arrays MUST have the same (Homogeneous) elements
// - i.e. int array = all int data types
// or String array all string references
// array divided into cells, each cell holds a single piece of data, called an element
// where the piece of data in a call is located, is referenced by the 'index'
// declare an array, using the 'new' operator.

// arrays are fixed once set.
// ArrayLists can grow in size and can re-size.

public class ArrayFun {
    public static void main(String[] args) {
        // create (declare) an array reference
        int [] myArray;

        // initialise new array
        myArray = new int[5]; // 5 = no. of cells in array
        // once the array size is set, it is fixed and you can't change it later.

        // set the data cells - elements and indexes
        myArray[0] = 5;
        myArray[1] = 11;
        myArray[2] = 24;
        myArray[3] = 17;
        myArray[4] = 54;

        // for loop
        // this is using the index number for reference
//        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//
//        } // end for

        // enhanced for loop
        // this is using the element value for reference - in this instance it's a number (int).
        // change int to String for example if the element is a String reference.
        for(int num : myArray) {
            System.out.println(num);
        }

    } // end main
}
