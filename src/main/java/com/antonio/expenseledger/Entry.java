package com.antonio.expenseledger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

/**
 * One line in the ledger.
 */
public class Entry {

    private final LocalDate entryDate;
    private final String description;
    private final BigDecimal amount;

    public Entry(LocalDate entryDate, String description, BigDecimal amount) {
        this.entryDate = entryDate;
        this.description = description;
        this.amount = amount.setScale(2,RoundingMode.HALF_UP);
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
