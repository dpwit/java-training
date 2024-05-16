import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int myRandomNumber;

        myRandomNumber = randomNum.nextInt();
        System.out.println("My random number is: \t" + myRandomNumber);

        myRandomNumber = randomNum.nextInt(1000); // limits random number between 0-999
        System.out.println("My random number between 0-999 is: \t" + myRandomNumber);

        //shifting
        myRandomNumber = randomNum.nextInt(1000) + 100; // limits random number between 100 - 999,so can't be less than 100 or more than 999. It shifts the starting point by 100!

        System.out.println("My random number between 100-999 is: \t" + myRandomNumber);

    } // end main
}
