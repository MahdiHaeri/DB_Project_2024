CREATE TABLE loans (
    id SERIAL PRIMARY KEY,
    customer_id INT NOT NULL, -- foreign key
    type VARCHAR(255) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    interest_rate DECIMAL(10, 2) NOT NULL,
    payment_period VARCHAR(255) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id)
);
