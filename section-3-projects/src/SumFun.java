import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int input;

        // priming read
        System.out.println("Please enter a non-negative integer to sum together,");
        System.out.println("or enter a negative integer to end the calculation!");

        input = keyboard.nextInt();

        while(input >= 0) {
            sum += input; //same as sum = sum + input
            System.out.println("Please enter another non-negative integer to sum together,");
            System.out.println("or enter a negative integer to end the calculation!");

            input = keyboard.nextInt();
        } // end while loop


        System.out.println("Sum of all non-negative integers is " + sum);
    } // end main
}
