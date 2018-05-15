package exercise2;

/*
* In this exercise you will develop a Java application that allows the user to process account information.
* Create a class named BankAccount.
* A bank account contains information about account number, owner's name, and the balance.
* Provide a constructor that allows the user to initialize account data.
* Provide all getter methods.
 * Provide the necessary methods that allow the user to withdraw or deposit money.
 * Provide a getAccountInfo method to return account information in a nicely formatted string.
 *
 * Write a driver class to test the bank account.
 * The driver class (main class) interacts with the user and calls BankAccount methods
 * to initialize or update the account.
 * Use the methods of JOptionPane class to provide input/output in the driver class.
*/

public class BankAccount {
    private String bankAccountNumber;
    private String ownerName;
    private float balance;

    public BankAccount(String bankAccountNumber, String ownerName, float balance) {
        this.bankAccountNumber = bankAccountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    private String WithdrawMoney(float withdrawal){
        if (withdrawal > balance){
            return String.format("Balance is not enough to withdraw $%.2f. Your balance is still $%.2f", withdrawal, balance);
        }
        else {
            balance -= withdrawal;
            return String.format("%.2f has been withdrawn. Your new balance is %.2f", withdrawal, balance);
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public float getBalance() {
        return balance;
    }

}
