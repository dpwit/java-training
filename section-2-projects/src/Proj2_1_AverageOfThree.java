import java.util.Scanner; // java.util is a package

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double realNumber1;
        double realNumber2;
        double realNumber3;
        double average;

        System.out.println("Enter a number you like, may include decimals ");
        realNumber1 = keyboard.nextDouble();
        System.out.println("Enter another number you like, may include decimals ");
        realNumber2 = keyboard.nextDouble();
        System.out.println("Enter a third number you like, may include decimals ");
        realNumber3 = keyboard.nextDouble();
        keyboard.nextLine(); // just a good habit to get into

        average = (realNumber1 + realNumber2 + realNumber3) / 3;

        System.out.println("The average of the three numbers you have entered is " + average);
    } //end main
}
