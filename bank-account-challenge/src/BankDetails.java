// Define the BankDetails class

import java.util.ArrayList; //need to create an array list
import java.util.List;

public class BankDetails {
    private List<BankAccount> accounts;

    public BankDetails() {
        accounts = new ArrayList<>(); // sets up the new ArrayList
    }

    // registerUser method registers a new user with the given account name and account number.
    public void registerUser(String accountName, String accountNumber) {
        if(getAccount(accountNumber) == null) {
            BankAccount newAccount = new BankAccount(accountName, accountNumber);
            accounts.add(newAccount); // adds new account to ArrayList.
            System.out.println("User account registered successfully.");
        }
        else {
            System.out.println("Account number already exists!");
        } // end if else
    } // end registerUser method

    // getAccount method searches for the account number.
    public BankAccount getAccount(String accountNumber) {
        // enhanced for loop
        for(BankAccount account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    } // end BankAccount getAccount


} // end BankDetails class
