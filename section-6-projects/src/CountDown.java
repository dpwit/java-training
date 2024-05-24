// method calls and recursion
// recursion is when a method calls itself

// for a method to be recursive, it needs
// At least one base case (no recursion in this case)
// At least one recursive case (this is where recursion happens)

public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
        countUpTo(1, 10);
    } // end main method

    public static void countDownFrom(int num) {
        if(num >= 0) { // this is the base case
            System.out.println(num);
            countDownFrom(num - 1); // this is the recursive case
        }
    } // end countDownFrom method

    // using a for loop for this particular case would be the best solution. This is just an easy-to-read example of how recursion works

    public static void countUpTo(int num1, int num2) {
        if(num1 <= num2) {
            System.out.println(num1);
            countUpTo(num1 +1, num2);
        }
    } // end countUpTo
}
