public class LogicalFun {
    //psvm shortcut keys to create this...
    public static void main (String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        // && both need to be true
        // || only one need be true
        // ! not equal to, ie flips true/false

        boolean combined = isRaining && isWarm;

        System.out.println("Is it raining and warm? " + combined);

        combined = isRaining || isWarm;

        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRaining;

        System.out.println("Is it NOT raining outside? " + combined);


    } //end main
}
