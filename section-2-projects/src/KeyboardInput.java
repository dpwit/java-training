import java.util.Scanner; // java.util is a package

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;

        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What is your age? ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // only needed after an Int, if there are more strings to follow. To consume the new line

        System.out.println("Enter a number you like, may include decimals ");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine(); // only needed after an Int, if there are more strings to follow. To consume the new line
        realNumber *= 2;

        System.out.println("Where do you live? ");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("The number you entered, doubled is... " + realNumber);
        System.out.println("And you live in " + city);

    } //end main
}
