package org.example;

public class BankAccount {
    private double balance;
    private final double minimumBalance;
    private final String accountHolderName;

    public BankAccount(String accountHolderName, double minimumBalance) {
        this.accountHolderName = accountHolderName;
        this.minimumBalance = minimumBalance;
        this.balance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        System.out.println("Attempting to withdraw: " + amount);
        System.out.println("current balance: " + balance);
        System.out.println("minimum balance: " + minimumBalance);
        System.out.println("balance after withdrawal attempt: " + (balance - amount));

        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balance);
            return true;
        }
        System.out.println("Withdrawal failed. Current Balance: " + balance);
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", minimumBalance=" + minimumBalance + ", accountHolderName='" + accountHolderName + '\''+ '}';
    }
}
