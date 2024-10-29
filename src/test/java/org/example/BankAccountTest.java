package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("John Doe", 100.0);
    }
    @Test
    public void testConstructor() {
        assertEquals("John Doe", account.getAccountHolderName());
        assertEquals(100.0, account.getMinimumBalance());
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.deposit(150.0);
        assertTrue(account.withdraw(50.0));
        assertEquals(200.0, account.getBalance());
        assertFalse(account.withdraw(201.0));
    }

    @Test
    public void testWithdrawFailsIfBelowMinimumBalance() {
        account.withdraw(50.0);
        account.withdraw(50.0);
        assertFalse(account.withdraw(60.0));
    }

}
