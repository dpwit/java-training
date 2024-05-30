public class IceCreamDemo {
    public static void main(String[] args) {
       IceCream chocChip = new IceCream("Choc Chip", 2, 2);
       IceCream nuts = new IceCream("Nutty", 4, 4);

       chocChip.addTopping("Chocolate chips");

       nuts.addTopping("Nuts");
       nuts.addTopping("Chocolate chips");

        printIceCream(chocChip);
        printIceCream(nuts);

    } // end main method

    public static void printIceCream(IceCream icecream) {
        System.out.println("Name: " + icecream.getName());
        System.out.println("Number of scoops: " + icecream.getNumScoops());
        System.out.println("Price: $" + icecream.getCost());
        System.out.println("Topped with: ");
        icecream.printToppings();
        System.out.println(); // just prints an extra line space for spacing layout.
    }
} // end IceCreamDemo class
