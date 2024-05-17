import java.util.Scanner;

public class Proj3_2_DivisibleByThree {

    public static void main(String[] args) {
        // use selection statement if else and modulus operator

        // Scanner is listening for keyboard inputs to capture and return.
        Scanner keyboard = new Scanner(System.in);

        int divisibleThree;

        System.out.print("Enter an integer to see if it is divisible by 3...\t");
        divisibleThree = keyboard.nextInt();

        if(divisibleThree % 3 == 0) {
            System.out.println(divisibleThree + " This integer is divisible by 3, well done!");
        }
        else {
            System.out.println(divisibleThree + " This is integer is NOT divisible by 3, unfortunately!");
        }

    } // end main
}
