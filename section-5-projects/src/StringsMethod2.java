// some other String methods
// toUpperCase, toLowerCase, substring and indexOf

public class StringsMethod2 {
    public static void main(String[] args) {

        String myName = "Darren Whatford";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsW = myName.indexOf("W");

        String lastName = myName.substring(7);

        System.out.println("My name is " + myName);
        System.out.println("Upper is " + upper);
        System.out.println("Lower is " + lower);
        System.out.println("W is at index " + whereIsW);
        System.out.println("Last name is " + lastName);

    } // end main
}
