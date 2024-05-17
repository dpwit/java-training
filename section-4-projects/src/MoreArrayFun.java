public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        // for loop
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        } // end for

        // enhance for loop
        for(int num :myArray) {
            System.out.println(num);
        }

    } // end main
}
