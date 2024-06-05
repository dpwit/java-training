// Define the BankAccount class

public class BankAccount {
    private String accountName;
    private String accountNumber;
    private double accountBalance;
    private static final double WITHDRAWAL_LIMIT = 200.00; // Just sets a maximum withdrawal limit.

    // create constructor - ctor (this overcomes the name shadowing)
    public BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0;
    } // end ctor

    // deposit method to add the given amount to the user's account balance.
    public void deposit(double amount) {
        if(amount > 0) {
            accountBalance += amount; // += is the same as accountBalance = accountBalance + amount.
            System.out.println("You successfully deposited: " + "£" + amount);
            System.out.println("Your new account balance is: " + "£" + accountBalance);
        }
        else {
            System.out.println("You tried to deposit an invalid amount!");
        } // end if-else statement
    } // end deposit method

    // withdraw(int amount): subtracts the given amount from the user's account balance (up to a maximum limit).
    public void withdrawal(double amount) {
        if(amount > 0 && amount <= accountBalance && amount <= WITHDRAWAL_LIMIT) {
            accountBalance -= amount; // -= is the same as accountBalance = accountBalance - amount.
            System.out.println("You successfully withdrew: " + "£" + amount);
            System.out.println("Your new account balance is: " + "£" + accountBalance);
        }
        else {
            System.out.println("You've tried to withdraw too much. The maximum is £200.00");
            System.out.println("Your balance is still: " + "£" + accountBalance);
        } //end if else
    } // end withdrawal method

    // getAccountName method returns the account name.
    public String getAccountName() {
        return accountName;
    } // end getAccountName method

    // getAccountNumber method returns the account number.
    public String getAccountNumber() {
        return accountNumber;
    } // end getAccountNumber method

    // getAccountBalance method returns the current account balance.
    public double getAccountBalance() {
        return accountBalance;
    } // end getAccountBalance method

} // end BankAccount class
