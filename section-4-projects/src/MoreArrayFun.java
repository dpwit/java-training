public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray;

        myArray = new int[10];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;

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
