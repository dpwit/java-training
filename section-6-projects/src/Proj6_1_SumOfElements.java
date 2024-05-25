import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(10);
        myArrayList.add(10);
        myArrayList.add(10);

        int sum = sumElements(myArrayList);

        System.out.println("Sum is " + sum);

    } // end main method

    public static int sumElements(ArrayList<Integer> myList) {
        int sum = 0;

        for(int i = 0; i < myList.size(); i++ ) {
            sum += myList.get(i);
        } // end for i loop

        return sum;
    } // end sumElements method
}
