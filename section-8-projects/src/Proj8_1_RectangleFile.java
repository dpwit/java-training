// print to console length, width, area and perimeter.
// reads input from file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangleList;
        rectangleList = new ArrayList<>();

        fillArrayList(rectangleList);
        printRectangles(rectangleList);

    } // end main method

    public static void fillArrayList(ArrayList<Rectangle> rectangleArrayList) {
        try {
            Scanner infile;

            infile = new Scanner(new File("rectangle_data.txt"));

            Rectangle temp;
            double length;
            double width;

            while(infile.hasNext()) {
                length= infile.nextDouble();
                width = infile.nextDouble();

                temp = new Rectangle(length, width);
                rectangleArrayList.add(temp);

            } // end while

            infile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found!");
        } // end try-catch

    } // end fillArrayList method

    public static void printRectangles(ArrayList<Rectangle> rectangleArrayList) {
        // enhanced for loop
        for(Rectangle r: rectangleArrayList) {
            System.out.println("Length is: " + r.getLength());
            System.out.println("Width is: " + r.getWidth());
            System.out.println("Area is: " + r.getLength() * r.getWidth());
            System.out.println("Perimeter is: " + ((r.getLength() * 2) + (r.getWidth() * 2)));
            System.out.println();
        }

    } // end printRectangles
} // end class
