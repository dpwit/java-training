// String objects are immutable - meaning they cannot be modified.

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String name4 = "Darren Whatford";
        String challengeName = "Mr Challenge";

        for(int i = 0; i < name4.length(); i++) {
            System.out.print(name4.charAt(i) + " "); // gives us the characters and prints String value. In this case Darren Whatford, with a space between each character.

        } // end for

        System.out.println(); // gives us an extra line space.

        // == equals equal to for a primitive type not reference type. Don't use to compare equals to.

        // use .equals
        if(name4.equals(name2)) {
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names aren't equal");
        } // end if else

        // .compareTo
        if(name4.compareTo(name2) > 0 ) { // char value of characters
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        } // end if else

        if(challengeName.compareTo(name) > 0) {
            System.out.println(challengeName + " is greater than " + name);
        }
        else {
            System.out.println(challengeName + " is less than " + name);
        } // end if else

    } // end main
}
