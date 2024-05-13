public class RelationalFun {
    // psvm shortcut keys

    /*
    Relational operators

    Used to compare values and return a boolean true or false
    > greater than
    >= greater than or equal to
    < less than
    <= less than or equal to
    == is equal to } equality operator
    != not equal to } equality operator

     */
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 54;

        String myName = "Darren";
        String yourName = "John";

        // sout is shortcut keys for this
        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);
        System.out.println("bobsAge is " + bobsAge);

        //relational operators
        boolean ageComparison = myAge > yourAge;
        System.out.println("Is my age > your age? " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("Is your age > Bob's age? " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("Is your age the same age as Bob? " + ageComparison);

        boolean nameComparison = myName.equals(yourName); // how to compare string values
        System.out.println("Is my name the same as your name? " + nameComparison);

        boolean currentAgeComparison = currentAge >= 21;
        System.out.println("Is my current age greater than or equal to 21? " + currentAgeComparison);
    } // end main
}
