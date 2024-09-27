CREATE TABLE expenses (
    id SERIAL PRIMARY KEY,
    date DATE,
    amount DECIMAL,
    description VARCHAR(255)
);
