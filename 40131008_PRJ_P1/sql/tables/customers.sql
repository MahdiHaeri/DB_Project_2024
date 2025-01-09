CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL, -- foreign key
    customer_id INT NOT NULL,
    type VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id)
);
