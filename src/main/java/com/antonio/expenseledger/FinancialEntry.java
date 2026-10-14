package com.antonio.expenseledger;

import jakarta.persistence.*;

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
    @Enumerated(EnumType.STRING)
    private EntryType entryType;

    protected FinancialEntry() {
    }

    public FinancialEntry(LocalDate entryDate, String description, BigDecimal amount, EntryType entryType) {
        this.entryDate = entryDate;
        this.description = description;
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
        this.entryType = entryType;
    }

    public Long getId() {
        return id;
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

    public EntryType getEntryType() {
        return entryType;
    }
}
