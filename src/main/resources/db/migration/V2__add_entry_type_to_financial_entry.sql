ALTER TABLE financial_entry ADD COLUMN entry_type VARCHAR(7) DEFAULT 'EXPENSE' NOT NULL;
ALTER TABLE financial_entry ADD CONSTRAINT check_entry_type_value CHECK (entry_type IN ('EXPENSE', 'INCOME'));
ALTER TABLE financial_entry ALTER COLUMN entry_type DROP DEFAULT;