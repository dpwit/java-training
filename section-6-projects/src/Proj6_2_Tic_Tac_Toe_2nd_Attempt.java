import java.util.Scanner;

public class Proj6_2_Tic_Tac_Toe_2nd_Attempt {
    public static void main(String[] args) {
        runGame();
    } // end main method

    public static void runGame() {
        String winner = "";
        boolean xTurn = true;
        int theRow = 0;
        int theCol = 0;
        String[][] gameBoard = new String[3][3]; // set the new board 3 rows x 3 cols

        initialiseGameBoard(gameBoard);

        // Print the initial board
        printCurrentBoard(gameBoard);

        // "" signals no winner
        while(winner.equals("")) {
            if(xTurn) {
                System.out.println("It's 'X's turn");

            }
            else {
                System.out.println("It's 'O's turn");
            } // end if else

            getUserInput(xTurn, gameBoard);
            System.out.println(); // gives extra spacing

            printCurrentBoard(gameBoard); // just re-prints updated board
            winner = getWinner(gameBoard);
            xTurn = !xTurn; // just flips it.

            if(winner.equals("") && isBoardFull(gameBoard)) {
                winner = "C";
            } // end if

        } // end while loop

        // if it's a tie
        System.out.println(); // just prints the extra spacing

        if(winner.equals("C")) {
            System.out.println("There is no winner, it's a tie!");
        } else {
            System.out.println("The winner is " + winner);
        } // end if else

    } // end runGame

    public static void initialiseGameBoard(String[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = " ";
            } // for j
        } // end for i
    } // end initialiseGameBoard method

    public static void printCurrentBoard(String[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);

                if(j < 2) {
                    System.out.print(" | ");
                }
            } // end for j
            System.out.println();

            if(i < 2) {
                System.out.print("- - - - -");
            }
            System.out.println();
        } // end for i

    } // end printCurrentBoard method

    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);

        int row = -1;
        int col = -1;
        boolean keepAsking = true;

        while(keepAsking) {
            System.out.print("Please enter the row and then "
                    + "the column, each from 0, 1 or 2 "
                    + "separated by a space.");

            row = keyboard.nextInt();
            col = keyboard.nextInt();
            keyboard.nextLine();

            if(row >= 0 && row <= 2 && col >= 0 && col <=2) {
                if(!cellAlreadyOccupied(row, col, gameBoard)) {
                    keepAsking = false;
                } else {
                    System.out.println("That cell is already taken!");
                } // end if else
            } // end if
        } // end while

        if(xTurn) {
            gameBoard[row][col] = "X";
        } else {
            gameBoard[row][col] = "O";
        }
    } // end getUserInput method

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    } // end cellAlreadyOccupied method

    public static String getWinner(String[][] gameBoard) {
        final int ROWS = gameBoard.length;
        final int COLS = gameBoard.length;

        // checks row
        for(int i = 0; i < ROWS; i++) {
            if(!gameBoard[i][0].equals(" ") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])) {
                return gameBoard[i][0];
            }
        } // end for

        // check col
        for(int i = 0; i < COLS; i++) {
            if(!gameBoard[0][i].equals(" ") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i])) {
                return gameBoard[0][1];
            }
        } // end for

        // check diagonal

            if(!gameBoard[0][0].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2])) {
                return gameBoard[2][0];
            }

        // check diagonal

        if(!gameBoard[2][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2])) {
            return gameBoard[0][0];
        }

        return "";

    } // end getWinner method

    public static boolean isBoardFull(String[][] gameBoard) {
        int countFill = 0;

        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                if(!gameBoard[i][j].equals(" ")) {
                    countFill++;
                }
            }
        }
        return countFill == 9;
    } // end isBoardFull method
}
