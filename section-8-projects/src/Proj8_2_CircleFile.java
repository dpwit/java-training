// print to console and to output file Radius, Circumference and area.
// reads input from file, writes output to file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {

        ArrayList<Circle> circleList;
        circleList = new ArrayList<>();

        fillArrayList(circleList);
        printCircles(circleList);

    } // end main method

    public static void fillArrayList(ArrayList<Circle> circleArrayList) {
        try {
            Scanner infile;

            infile = new Scanner(new File("circle_data.txt"));

            Circle temp;
            double radius;

            while(infile.hasNext()) {
                radius= infile.nextDouble();

                temp = new Circle(radius);
                circleArrayList.add(temp);

            } // end while

            infile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found!");
        } // end try-catch

    } // end fillArrayList method

    public static void printCircles(ArrayList<Circle> circleArrayList) {
        // enhanced for loop
        for(Circle c: circleArrayList) {

            DecimalFormat df = new DecimalFormat("#.00");
            String formattedCircumference = df.format(c.circumference());
            String formattedArea = df.format(c.area());

            System.out.println("Radius is: " + c.getRadius());
            System.out.println("Circumference is: " + formattedCircumference);
            System.out.println("Area is: " + formattedArea);

            System.out.println();

            try {
                PrintWriter pw = new PrintWriter("circles_output.txt");

                DecimalFormat pdf = new DecimalFormat("#.00");
                String printedFormattedCircumference = pdf.format(c.circumference());
                String printedFormattedArea = pdf.format(c.area());

                for(Circle pc: circleArrayList) {
                    pw.println(pc.getRadius());
                    pw.println(printedFormattedCircumference);
                    pw.println(printedFormattedArea);
                    pw.println();
                }

                pw.close();
            }
            catch (FileNotFoundException ex){
                System.out.println("Couldn't write to file!");
            } // end try-catch
        } // end for loop

    } // end printRectangles
} // end Proj8_2_CircleFile class
