CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    sender_id INT NOT NULL, -- foreign key
    receiver_id INT NOT NULL,
    value DECIMAL(10, 2) NOT NULL,
    type VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL, -- pending, completed, failed
    open_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    close_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_sender_id FOREIGN KEY (sender_id) REFERENCES users(id)
);
