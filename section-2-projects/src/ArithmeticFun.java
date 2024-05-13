public class ArithmeticFun {
    /*
        Operators are...
       + = addition
       - = minus
       * = multiplication
       / = division
       % = modulus
     */
    public static void main (String[] args) {
        int a = 10;
        int b = 15;

        // BINARY operators eg...
        int result = a + b;
        int resultAdd = a + b; // + is addition operator
        int resultMinus = b - a;
        int resultDivide = b / a;
        int resultMultiply = a * b;
        int resultRemainder = b % a;

        System.out.println("The result is " + resultAdd); // + is the concatenation operator
        System.out.println("The result is " + resultMinus);
        System.out.println("The result is " + resultDivide + " This is only 1 and not a decimal 1.5 because a and b are int");
        System.out.println("The result is " + resultMultiply);
        System.out.println("The result is " + resultRemainder);

        resultAdd += 20; // += is known as a compound operator same as resultAdd = resultAdd + 20.

        /*
        Compound Operators are...
       +=
       -=
       *=
       /=
       %=
     */

        System.out.println("The result is now " + resultAdd);

        // adding or subtracting 1 from a number is very common...

        //UNARY operators eg...
        result++;
        System.out.println("Result++ " + result);
        result--;
        System.out.println("Result++ " + result);

        resultMultiply *= 2;

        System.out.println(resultMultiply);
    }
}
