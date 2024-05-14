public class ControlStatementsIntro {
    // types of control statements
    // sequential (sequence)
    // selection (decision)
    // repetition (loops)
    public static void main (String[] args) {
        int age = 15;

        if(age >=16) {
            System.out.println("You can get your driving licence now if you want!");
        }
        else {
            System.out.println("You can't get your driving licence yet unfortunately!");
        } // end if-else

        System.out.println(); //just adds a new line for space layout.

        // incremental number count output
        for(int i = 1; i <= age; i++) {
            System.out.println("Incremental number count: " + i);
        } // end for

    } // end main
}
