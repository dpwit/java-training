public class LogicalFun {
    //psvm shortcut keys to create this...
    public static void main (String[] args) {
        boolean isRunning = true;
        boolean isWarm = true;

        // && both need to be true
        // || only one need be true
        // ! not equal to, ie flips true/false

        boolean combined = isRunning && isWarm;

        System.out.println("Is it raining and warm? " + combined);

        combined = isRunning || isWarm;

        System.out.println("Is it raining OR warm? " + combined);

        combined = !isRunning;

        System.out.println("Is it NOT raining outside? " + combined);


    } //end main
}
