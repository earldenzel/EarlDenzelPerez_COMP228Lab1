package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        //Let user input and initialize bank account details
        String bankAccountNumber = JOptionPane.showInputDialog(null,"Please input bank account number");
        String ownerName = JOptionPane.showInputDialog(null,"Please input bank account owner's name");
        double initialAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter initial amount of the bank account"));

        //Create bank account object
        BankAccount account = new BankAccount(bankAccountNumber,ownerName,initialAmount);

        //bank account menu
        String[] buttons = { "Withdraw", "Deposit", "Quit" };
        int rc = 0;
        while (rc != 2){
            rc = JOptionPane.showOptionDialog(null, account.getAccountInfo(), "Account Details", JOptionPane.DEFAULT_OPTION, 3, null, buttons, buttons[2]);
            switch (rc){
                case 0: //withdrawal
                    double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("Withdraw amount"));
                    JOptionPane.showMessageDialog(null, account.WithdrawMoney(withdrawal));
                    break;
                case 1: //deposit
                    double deposit = Double.parseDouble(JOptionPane.showInputDialog("Deposit amount"));
                    JOptionPane.showMessageDialog(null, account.DepositMoney(deposit));
                    break;
                default: //quit
                    break;
            }
        }
    }
}
