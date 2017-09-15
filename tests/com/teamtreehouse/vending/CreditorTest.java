package com.teamtreehouse.vending;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by moon on 9/14/17.
 */
public class CreditorTest {
    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(10);
        int refund = creditor.refund();

        assertEquals(10, refund);
    }

    @Test
    public void refundingResetsAvailableFundsToZero() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(10);
        int refund = creditor.refund();

        assertEquals(0, creditor.getAvailableFunds());
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        // Arrange objects so they're ready for testing
        Creditor creditor = new Creditor();

        // Act perform the object under test
        creditor.addFunds(25);
        creditor.addFunds(25);

        // Assert that the expected == actual
        // argument order is expected, then actual
        assertEquals(50, creditor.getAvailableFunds());
    }

}