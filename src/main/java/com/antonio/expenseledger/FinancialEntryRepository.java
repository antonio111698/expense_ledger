package com.antonio.expenseledger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialEntryRepository extends JpaRepository<FinancialEntry,Long> {
}


