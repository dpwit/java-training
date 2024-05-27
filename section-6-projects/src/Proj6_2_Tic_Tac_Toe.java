import java.util.Scanner; // needed for user input

public class Proj6_2_Tic_Tac_Toe {
    static char[][] board = new char[3][3]; // creates new 3 x 3 board

    public static void main(String[] args) {
        initializeBoard();
        playGame(); // calls the method playGame which has the primary loop in it.
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playGame() {
        boolean player1Turn = true;
        boolean gameEnded = false;
        Scanner keyboard = new Scanner(System.in);

        // while loop
        while (!gameEnded) {
            printBoard();
            char currentPlayer = player1Turn ? 'X' : 'O';
            System.out.println("Player " + currentPlayer + "'s turn:");

            int row = -1;
            int col = -1;

            while (true) {
                System.out.print("Enter row (0, 1, or 2): ");
                row = keyboard.nextInt();
                System.out.print("Enter column (0, 1, or 2): ");
                col = keyboard.nextInt();

                if (row < 0 || col < 0 || row >= 3 || col >= 3) {
                    System.out.println("This position is off the bounds of the board! Try again.");
                } else if (board[row][col] != '-') {
                    System.out.println("Someone has already made a move at this position! Try again.");
                } else {
                    break;
                }
            }

            board[row][col] = currentPlayer;

            if (hasWon(currentPlayer)) {
                gameEnded = true;
                System.out.println("Player " + currentPlayer + " has won!");
            } else if (isBoardFull()) {
                gameEnded = true;
                System.out.println("The game ended in a tie!");
            } else {
                player1Turn = !player1Turn;
            }
        } // end while loop

        printBoard();
        keyboard.close();
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasWon(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}
