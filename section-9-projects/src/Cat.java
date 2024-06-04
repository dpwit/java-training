public class Cat extends Animal implements IMovable {
    // create ctor
    public Cat(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise() {
        return "Meow!";
    }

    @Override
    public String move() {
        return "I'm playing with string!";
    }
} // end Cat class

