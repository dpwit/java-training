import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the pub and grill");

        System.out.print("Please enter your age...\t");
        age = keyboard.nextInt();

        // if else statement
       if(age >= 21) {
           System.out.println("Here, enjoy a nice cold beer!");
       }
       else if(age >= 16) {
            System.out.println("Here, enjoy a nice cold Coke Cola!");
            System.out.println("At least you can drive here!");
       }
       else {
           System.out.println("Here, enjoy a nice cold Coke Cola!");
       } // end if else

       System.out.println("Thanks for coming to the pub and grill");
       }
    }

