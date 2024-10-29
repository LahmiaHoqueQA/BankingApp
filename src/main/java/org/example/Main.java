package org.example;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 100.0, 1.5);
        CurrentAccount current = new CurrentAccount("Bob", 200.0, 500.0);

        savings.deposit(500);
        current.deposit(1000);

        savings.addInterest();
        current.withdraw(300);

        System.out.println(savings);
        System.out.println(current);
    }
}
