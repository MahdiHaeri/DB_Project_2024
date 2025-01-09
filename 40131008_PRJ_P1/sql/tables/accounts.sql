CREATE TABLE accounts (
    id SERIAL PRIMARY KEY,
    loan_id INT NOT NULL, -- foreign key
    due_date DATE NOT NULL,
    payment_date DATE NOT NULL,
    amount_due DECIMAL(10, 2) NOT NULL,
    amount_paid DECIMAL(10, 2) NOT NULL,
    interest_paid DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_loan_id FOREIGN KEY (loan_id) REFERENCES loans(id)
);
