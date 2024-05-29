public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mr D P Whatford", 1000);
        BankAccount acc2 = new BankAccount("Jules Whatford", 500);
        BankAccount acc3 = new BankAccount("Dummy Account");

        acc1.printBankAccount();
        acc2.printBankAccount();
        acc3.printBankAccount();

        acc3.deposit(1000);
        System.out.println("Bank account owner is " + acc3.getOwner());
        System.out.println("New Balance is " + acc3.getBalance());
        System.out.println();

        acc3.withdraw(5000); // should give warning as withdrawal is too much!
        System.out.println("Bank account owner is " + acc3.getOwner());
        System.out.println("New Balance is still " + acc3.getBalance());
        System.out.println();

        acc3.withdraw(100);
        System.out.println("You successfully withdrew " + 100);
        System.out.println("Bank account owner is " + acc3.getOwner());
        System.out.println("New Balance is " + acc3.getBalance());
        System.out.println();

    } // end main method
} // end BankAccountDemo class
