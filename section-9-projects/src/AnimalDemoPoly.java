import java.lang.reflect.Array;

public class AnimalDemoPoly {public static void main(String[] args) {
    Animal [] animals = new Animal[6];

    animals[0] = new Dog("Daisy", 50);
    animals[1] = new Dog("Ed", 45);
    animals[2] = new Dog("Fido", 100);
    animals[3] = new Cat("Felix", 35);
    animals[4] = new Cat("Tom", 75);
    animals[5] = new Tiger("Tony", 1000);

    printAnimals(animals);

    } // end main method

    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("Name is " + animal.getName());
            System.out.println("Weight is " + animal.getWeight());
            System.out.println("Animal says: " + animal.makeNoise());
            System.out.println(); // just adds an extra line space.
        }
    }
} // end AnimalDemoPoly class
