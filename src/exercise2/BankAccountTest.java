package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Enter account details");

        //Let user input and initialize bank account details
        String bankAccountNumber = JOptionPane.showInputDialog(frame,"Please input bank account number");
        String ownerName = JOptionPane.showInputDialog(frame,"Please input bank account owner's name");
        double initialAmount = Double.parseDouble(JOptionPane.showInputDialog(frame, "Please enter initial amount of the bank account"));

        //This is an example bank account number
        //BankAccount account = new BankAccount("002 12345 987654321", "Earl", 100.25);

        //Create bank account object
        BankAccount account = new BankAccount(bankAccountNumber,ownerName,initialAmount);

        //bank account menu
        String[] buttons = { "Withdraw", "Deposit", "Quit" };
        int rc = 0;
        while (rc != 2){
            rc = JOptionPane.showOptionDialog(null, account.AccountDetails(), "Account Details", JOptionPane.DEFAULT_OPTION, 3, null, buttons, buttons[2]);
            switch (rc){
                case 0: //withdrawal
                    double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("Withdraw amount"));
                    JOptionPane.showMessageDialog(frame, account.WithdrawMoney(withdrawal));
                    break;
                case 1: //deposit
                    double deposit = Double.parseDouble(JOptionPane.showInputDialog("Deposit amount"));
                    JOptionPane.showMessageDialog(frame, account.DepositMoney(deposit));
                    break;
                default: //quit
                    break;
            }
        }
    }
}
