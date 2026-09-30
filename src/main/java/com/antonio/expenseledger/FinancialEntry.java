package com.antonio.expenseledger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;


@Entity
public class FinancialEntry {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate entryDate;
    private String description;
    private BigDecimal amount;


    protected FinancialEntry() { }

    public FinancialEntry(LocalDate entryDate, String description, BigDecimal amount) {
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
