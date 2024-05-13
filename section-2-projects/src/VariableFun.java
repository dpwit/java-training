public class VariableFun {
    public static void main (String[] args) {
        // int is a data type integer (no decimal points).
        // age is a variable name to store a value (variable must start with a lowercase letter and be camel case).
        // 54 is the value.
        int myAge; //declaration
        myAge = 54; //initialisation (assignment statement)

        final int SOME_NUM = 150; // constants - you can't change this value. Note the format of uppercase and underscore

        String myName = "Darren";

        String myHomeTown = "Ringmer";

        System.out.println(myName + " is " + myAge);
        System.out.print(myName + " is " + myAge + '\n'); // \n adds a new line after.
        System.out.println("My home town is " + myHomeTown);
    };
}
