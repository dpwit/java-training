public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(2, 4, "Blue");

        myHouse.setNumStories(3);
        myHouse.setNumWindows(6);
        myHouse.setColor("White");

//        yourHouse.setNumStories(2);
//        yourHouse.setNumWindows(4);
//        yourHouse.setColor("Blue");

//        System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.numStories() + " stories");
//        System.out.println("Your House has " + yourHouse.getNumWindows() + " windows " + "and is " + yourHouse.getColor());
//
//        System.out.println("My house is " + myHouse.getColor());
//        System.out.println("My House has " + myHouse.getNumWindows() + " windows " + "and is " + myHouse.getColor());

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);

    } // end main method

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() + "\nand has " + house.getNumWindows() + " windows over " + house.numStories() + " stories");
    } // end printHouseData method
} // end HouseDemo class
