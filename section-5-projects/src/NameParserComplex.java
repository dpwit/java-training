import java.util.Scanner;

public class NameParserComplex {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;

        System.out.println("Please enter your full name ...");
        fullName = keyboard.nextLine();

        int indexOfSpace = fullName.indexOf(" ");

        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);

        firstName = firstName.toLowerCase();
        lastName = lastName.toUpperCase();

        System.out.println("Fist name is " + firstName);
        System.out.println("Last name is " + lastName);

    } // end main
}