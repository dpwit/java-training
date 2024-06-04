public abstract class Animal {
    private String name;
    private double weight;

    // make constructor ctor - (this overcomes the name shadowing)
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;

    } // end ctor

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

//    public String makeNoise() {
//        return "Grrr!";
//    }

    // abstract class
    public abstract String makeNoise();
} // end Animal class
