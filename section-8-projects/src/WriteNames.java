import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteNames {
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Darren");
        namesList.add("Jules");
        namesList.add("Jake");
        namesList.add("Kate");
        namesList.add("Ed");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            // print from the ArrayList to names.txt
            for(int i = 0; i < namesList.size(); i++) {
                pw.println(namesList.get(i));
            } // end for loop

            // enhance for loop to write names from ArrayList to names.txt
            for(String names : namesList) {
                pw.println(names);
            } // emd for loop

            pw.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't write to file!");
        } // end try-catch

    } // end main method
} // end WriteNames class
