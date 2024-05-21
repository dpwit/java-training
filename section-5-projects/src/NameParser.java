import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fullName;

        System.out.println("Please enter your name as a single string...");
        fullName = keyboard.nextLine();

        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(6);

        System.out.println("Fist name is " + firstName);
        System.out.println("Last name is " + lastName);

    } // end main
}
