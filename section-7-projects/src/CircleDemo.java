// circumference = 2PIr (2 x PI x radius)
// Area = PIr2 (PI x radius squared)
// PI = you can use built in java lang Math.PI
// r2 = could just do radius x radius or use the built in java lang Math.pow(base,exp) (radius,2) in this case.
// set radius, circumference and area of a circle

import java.text.DecimalFormat;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(4.0);
        Circle c4 = new Circle(5.5);

        printCircleData(c1);
        printCircleData(c2);
        printCircleData(c3);
        printCircleData(c4);

    } // end main method

    public static void printCircleData(Circle circle){

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedCircumference = df.format(circle.circumference());
        String formattedArea = df.format(circle.area());

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Circumference: " + formattedCircumference);
        System.out.println("Area: " + formattedArea);
        System.out.println(); // extra spacing
    } // end printCircleData method
} // end CircleDemo class
