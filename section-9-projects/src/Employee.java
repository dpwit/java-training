public abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;

    // make constructor ctor
    public Employee(String firstName, String lastName, int  age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    } // end ctor

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // abstract method
    public abstract String work(); // end abstract method
} // end Employee class
