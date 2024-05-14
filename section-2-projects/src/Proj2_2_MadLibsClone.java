import java.util.Scanner;

public class Proj2_2_MadLibsClone {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String adjective1;
        String girlsName;
        String adjective2;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String boysName;
        String mansName;

        System.out.print("Please enter a descriptive word...\t");
        adjective1 = keyboard.nextLine();
        System.out.print("Now enter a girls name...\t");
        girlsName = keyboard.nextLine();
        System.out.print("Enter her occupation...\t");
        adjective2 = keyboard.nextLine();
        System.out.print("Where is she from?\t");
        place = keyboard.nextLine();
        System.out.print("What clothes does she like to wear?\t");
        clothing = keyboard.nextLine();
        System.out.print("And what is her hobby?\t");
        hobby = keyboard.nextLine();
        System.out.print("Please enter another occupation...\t");
        adjective3 = keyboard.nextLine();
        System.out.print("Now enter a boy's name...\t");
        boysName = keyboard.nextLine();
        System.out.print("Finally enter a man's name...\t");
        mansName = keyboard.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + ", who was a " + adjective2 + " in the Kingdom of " + place + ". She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 + " named " + boysName + " but her father, the King " + mansName + " forbid her from seeing him.");

    } //end main
}
