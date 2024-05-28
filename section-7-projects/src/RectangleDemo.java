public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle recOne = new Rectangle();
        Rectangle recTwo = new Rectangle(5.5, 2.5);
        Rectangle recThree = new Rectangle(10, 2.25);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle recFour;

        System.out.println("After recFour declared: " + Rectangle.getNumRectangles());

        recFour = new Rectangle(20, 5.75);

        System.out.println("After recFour initialised: " + Rectangle.getNumRectangles());

        System.out.println(recOne.area());
        System.out.println(recTwo.area());
        System.out.println(recThree.area());
        System.out.println(recFour.area());
        System.out.println();

        System.out.println(recOne.perimeter());
        System.out.println(recTwo.perimeter());
        System.out.println();

        printRectangleData(recOne);
        System.out.println();
        printRectangleData(recTwo);
        System.out.println();
        printRectangleData(recThree);

    } // end main method

    public static void printRectangleData(Rectangle rectangle) {
        System.out.println("The rectangle is " + rectangle.geLength() + " long " + rectangle.getWidth() + " wide");
    } // end printHouseData method

} // end RectangleDemo class
