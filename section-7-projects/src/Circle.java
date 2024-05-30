// circumference = 2PIr (2 x PI x radius)
// Area = PIr2 (PI x radius squared)
// PI = you can use built in java lang Math.PI
// r2 = could just do radius x radius or use the built in java lang Math.pow(base,exp) (radius,2) in this case.
// set radius, circumference and area of a circle

public class Circle {
    private double radius;

    public Circle() {
        this(1.00);
    } // no args ctor

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
} // end Circle class
