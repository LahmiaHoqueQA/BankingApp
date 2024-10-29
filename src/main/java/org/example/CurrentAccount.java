package org.example;

public class CurrentAccount extends BankAccount{
    private double maxWithdrawalAmount;

    public CurrentAccount(String accountHolderName, double minimumBalance, double maxWithdrawalAmount) {
        super(accountHolderName, minimumBalance);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > maxWithdrawalAmount) {
            return false;
        }
        return super.withdraw(amount);
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }
}
