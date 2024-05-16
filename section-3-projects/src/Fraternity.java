import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Please enter your age...");
        age = keyboard.nextInt();

        System.out.println("Please enter your gender M/F...");
        gender = keyboard.next().charAt(0);

        // if else statement
        if(age >= 19 && gender == 'M') {
            System.out.println("Great, you can join the Fraternity!");
        }

        else if (age >= 19 && gender == 'F') {
            System.out.println("Unfortunately, you can't join the Fraternity. Only men allowed!");
        }

        else if (age <= 18 && gender == 'M') {
            System.out.println("Unfortunately, you can't join the Fraternity. You're not old enough!");
        }

        else if (age <= 18 && gender == 'F') {
            System.out.println("Unfortunately, you can't join the Fraternity. You're not old enough! And you're Female");
        }

        else {
            System.out.println("Unfortunately, you can't join the Fraternity.");
        } // end if else


    } // end main
}
