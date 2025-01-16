CREATE TABLE IF NOT EXISTS users
(
    id           SERIAL PRIMARY KEY,
    username     VARCHAR(255) NOT NULL,
    password     VARCHAR(255) NOT NULL,
    first_name   VARCHAR(255) NOT NULL,
    last_name    VARCHAR(255) NOT NULL,
    role         VARCHAR(255) NOT NULL, -- admin, employee, customer
    birthday     DATE         NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    address      VARCHAR(255) NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS transactions
(
    id          SERIAL PRIMARY KEY,
    sender_id   INT            NOT NULL, -- foreign key
    receiver_id INT            NOT NULL,
    value       DECIMAL(10, 2) NOT NULL,
    type        VARCHAR(255)   NOT NULL,
    status      VARCHAR(255)   NOT NULL, -- pending, completed, failed
    open_date   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    close_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_sender_id FOREIGN KEY (sender_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS employees
(
    id          SERIAL PRIMARY KEY,
    user_id     INT          NOT NULL, -- foreign key
    employee_id INT          NOT NULL,
    job_title   VARCHAR(255) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS customers
(
    id          SERIAL PRIMARY KEY,
    user_id     INT          NOT NULL, -- foreign key
    customer_id INT          NOT NULL,
    type        VARCHAR(255) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS loans
(
    id             SERIAL PRIMARY KEY,
    customer_id    INT            NOT NULL, -- foreign key
    type           VARCHAR(255)   NOT NULL,
    amount         DECIMAL(10, 2) NOT NULL,
    interest_rate  DECIMAL(10, 2) NOT NULL,
    payment_period VARCHAR(255)   NOT NULL,
    start_date     DATE           NOT NULL,
    end_date       DATE           NOT NULL,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers (id)
);

CREATE TABLE IF NOT EXISTS installments
(
    id            SERIAL PRIMARY KEY,
    loan_id       INT            NOT NULL, -- foreign key
    due_date      DATE           NOT NULL,
    payment_date  DATE           NOT NULL,
    amount_due    DECIMAL(10, 2) NOT NULL,
    amount_paid   DECIMAL(10, 2) NOT NULL,
    interest_paid DECIMAL(10, 2) NOT NULL,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_loan_id FOREIGN KEY (loan_id) REFERENCES loans (id)
);

CREATE TABLE IF NOT EXISTS accounts
(
    id            SERIAL PRIMARY KEY,
    loan_id       INT            NOT NULL, -- foreign key
    due_date      DATE           NOT NULL,
    payment_date  DATE           NOT NULL,
    amount_due    DECIMAL(10, 2) NOT NULL,
    amount_paid   DECIMAL(10, 2) NOT NULL,
    interest_paid DECIMAL(10, 2) NOT NULL,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_loan_id FOREIGN KEY (loan_id) REFERENCES loans (id)
);
