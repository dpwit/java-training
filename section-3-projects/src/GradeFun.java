import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char grade; // this could be a string, as it's one letter, char is better.

        System.out.println("Plesae enter a grade...");
        //this would be used for a string.
        //grade = keyboard.next();

        // as we're using char, this is a better option
        grade = keyboard.next().charAt(0);

        // switch statement
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Great job getting an A.");
                break;
            case 'B':
            case 'b':
                System.out.println("Great to get a B, almost there.");
                break;
            case 'C':
            case 'c':
                System.out.println("Getting a C is great! Well done!");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do better than a D!");
                break;
            case 'E':
            case 'e':
                System.out.println("You're getting close to failing!");
                break;
            case 'F':
            case 'f':
                System.out.println("FAILED! Loser!");
                break;
            default: // this is like an else if none of the above are true.
                System.out.println("You have entered an invalid grade value!");

        } // end switch


    } // end main
}
