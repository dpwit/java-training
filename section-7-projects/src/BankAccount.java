public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    } // end first constructor ctor

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;

    } // end ctor

    public String getOwner()  {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0){
            balance += amount; // same as balance = balance + amount
        } else {
            System.out.println("The amount you want to deposit must be more than $0");
        } // end if else statement
    } // end deposit

    public void withdraw(int amount) {
        if(amount > 0 && amount < balance) {
            balance -= amount; // same as balance = balance - amount
        } else {
            System.out.println("You don't have enough money to withdraw that amount " + "Your current balance is: " + balance);
        }
    } // end withdraw

    public void printBankAccount() {
        System.out.println("Bank account owner is " + owner);
        System.out.println("Account balance is " + balance);
        System.out.println();
    }
} // end BankAccount class
