package com.antonio.expenseledger;

public enum EntryType {
    INCOME("Income"),
    EXPENSE("Expense");

    private final String text;

    EntryType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

