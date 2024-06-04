public class Worker extends Employee{
    // create ctor
    public Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    } // end ctor

    @Override
    public String work() {
        return "I'm busy getting work done!";
    }
} // end worker class
