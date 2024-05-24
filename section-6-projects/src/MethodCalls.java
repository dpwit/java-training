public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    } // end main

    public static void doSomething() { // where doSomething is our own method we created
        System.out.println("Prints this from this doSomething method in the main method as it's called (invoked) from the main method");

        int result = getSomeValue(); // get's the result 150 from the getSomeValue method.

        // this prints from this doSomething method in the main method as this doSomething method is called from the main method.
        System.out.println("Result is: " + result);
    } // end doSomething method

    public static int getSomeValue() {
        return 150;
    } // end getSomeValue method
}
