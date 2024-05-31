import java.io.FileNotFoundException;
import java.io.PrintWriter; // prints to a file

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hi there!");
            pw.println("My name is Darren Whatford :)");

            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't write to file!");
        } // end try-catch

    } // end main method
} // end FileOutputFun class
