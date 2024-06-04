public class Manager extends Employee {

    // create ctor
    public Manager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    } // end ctor

    @Override
    public String work() {
        return "I'm busy bossing everyone around!";
    }
} // end Manager class
