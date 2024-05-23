// pass-by-value - technically java only supports pass-by-value
// a copy is made of the data being passed in
// changes made to the copy inside the method, do not affect the original.

// pass-by-reference
// the address is passed in.
// any changes made to the parameter in the method affects the argument that was passed in when the method was called (invoked)

// Method overloading.
// Same method nane, different parameter lists

public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5,4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);

        String resultString = getResult("Darren", "Whatford");
        System.out.println(resultString);

    } // end main method

    public static int getResult(int num) { // same method name, different parameter list
        return num * 2;
    } // end getResult method

    public static int getResult(int num1, int num2) { // same method name, different parameter list
        return num1 * num2;
    } // end getResult method

    public static int getResult(int num1, String value) { // same method name, different parameter list
        return num1 * Integer.parseInt(value);
    } // end getResult method

    public static String getResult(String value1, String value2) { // same method name, different parameter list
        return value1 + " " + value2;
    } // end getResult method
}
