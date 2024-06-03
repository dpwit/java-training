public class Cat extends Animal {
    // create ctor
    public Cat(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise() {
        return "Meow!";
    }
} // end Cat class

