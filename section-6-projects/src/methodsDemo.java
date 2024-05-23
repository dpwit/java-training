// Methods used before: main, print, println methods for example.

// User-defined methods - are methods we can write ourselves.

// Methods are just blocks of named code to break a larger project into smaller manageable pieces of code
// that we can call (invoke) more than once, whenever needed.


import java.sql.SQLOutput;

public class methodsDemo {

    // void, main method
    public static void main(String[] args) // header of the method main definition
    {
        // body of the method definition
        printHello();
        printNumber(10); // 10 is an argument, passed into the parameter
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5); // 3 and 5 are the arguments, passed into the parameter
        System.out.println(result);

        double resultSquare;

        resultSquare = squareResult(3.5, 3.5);
        System.out.println(resultSquare);

    } // end main

    // void, parameterless method = nothing in the ()
    public static void printHello() {
        System.out.println("Hello!");
    } // end printHello

    // void, parameterized method = has parameters, in this case int a, a is a parameter, to receive the argument 10 (see above)
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    } // end printNumber

    // value-returning parameterless method
    public static int giveMe10() {
        return 10;
    } // end giveMe10

    // value-returning parameterized method = has parameters, in this case int num1 and num2,
    // num1 and num2 are parameters, to receive the arguments 3 and 5 (see above)
    public static int addThese (int num1, int num2) {
        return num1 + num2;
    } // end addThese

    public static double squareResult (double dub1, double dub2) {
        return dub1 * dub2;
    } // end square

}
