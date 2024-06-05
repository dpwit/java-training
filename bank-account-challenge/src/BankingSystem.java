import java.sql.SQLOutput;
import java.util.Scanner; // needed for user input

public class BankingSystem {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(); // just to give an extra line space.
            System.out.println("Welcome to the Banking System");
            System.out.println("Choose one of the following options...");
            System.out.println(); // just to give an extra line space.
            System.out.println("1. Register a new user.");
            System.out.println("2. Deposit some money.");
            System.out.println("3. Withdraw some money.");
            System.out.println("4. Check your balance");
            System.out.println("5. To exit the banking system.");

            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = keyboard.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = keyboard.nextLine();
                    bankDetails.registerUser(name, accountNumber);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = keyboard.nextLine();
                    BankAccount account = bankDetails.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = keyboard.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = keyboard.nextLine();
                    account = bankDetails.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = keyboard.nextDouble();
                        account.withdrawal(withdrawalAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = keyboard.nextLine();
                    account = bankDetails.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Current balance: " + "£" + account.getAccountBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking System.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            } // end switch
        } // end while

        keyboard.close();

    } // end main method
} // end BankingSystem class
