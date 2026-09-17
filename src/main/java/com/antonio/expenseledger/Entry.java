package com.antonio.expenseledger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

/**
 * One line in the ledger.
 */
public class Entry {

    private final LocalDate date;
    private final String description;
    private final BigDecimal amount;

    public Entry(LocalDate date, String description, BigDecimal amount) {
        this.date = date;
        this.description = description;
        this.amount = amount.setScale(2,RoundingMode.HALF_UP);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
