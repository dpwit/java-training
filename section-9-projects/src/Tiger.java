public class Tiger extends Animal {
    // create ctor
    public Tiger(String name, double weight) {
        super(name, weight);
    } // end ctor

    @Override
    public String makeNoise() {
        return "Roar!";
    }
} // end Tiger class


