CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL, -- foreign key
    employee_id INT NOT NULL,
    job_title VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id)
);
