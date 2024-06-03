public class Dog extends Animal {
    // create ctor
    public Dog(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise() {
        return "Woof!";
    }
} // end Dog class
