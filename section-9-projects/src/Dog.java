public class Dog extends Animal implements IMovable {
    // create ctor
    public Dog(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise() {
        return "Woof!";
    }

    @Override
    public String move() {
        return "I'm wagging my tail!";
    }
} // end Dog class
