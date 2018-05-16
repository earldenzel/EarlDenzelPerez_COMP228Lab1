package exercise2;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("B1234", "Earl", 100.25);
        JFrame frame = new JFrame("Account Status");

        double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("Withdraw amount"));

        JOptionPane.showMessageDialog(frame, account.WithdrawMoney(withdrawal));

        double deposit = Double.parseDouble(JOptionPane.showInputDialog("Deposit amount"));

        JOptionPane.showMessageDialog(frame, account.DepositMoney(deposit));




    }
}
