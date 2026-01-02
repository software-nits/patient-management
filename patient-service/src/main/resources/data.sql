-- Ensure patient table exists before inserting data
CREATE TABLE IF NOT EXISTS patient (
    id                  UUID PRIMARY KEY,
    name                VARCHAR(255)         NOT NULL,
    email               VARCHAR(255) UNIQUE  NOT NULL,
    address             VARCHAR(255)         NOT NULL,
    registration_date   DATE                 NOT NULL,
    date_of_birth       DATE                 NOT NULL
);
-- Insert sample patient data
-- INSERT INTO patient (id, name, email, address, registration_date, date_of_birth) VALUES
-- ("999e4178-3f24-48b8-94e5-399db89eb255", 'John Doe', 'john.doe@example.com', '123 Main St, Anytown, USA', '2023-01-01', '1990-01-01'),
-- ("999e4178-3f24-48b8-94e5-399db89eb256", 'Jane Smith', 'jane.smith@example.com', '456 Oak St, Sometown, USA', '2023-01-02', '1995-02-02'),
-- ("999e4178-3f24-48b8-94e5-399db89eb257", 'Alice Johnson', 'alice.johnson@example.com', '789 Pine St, Othertown, USA', '2023-01-03', '1985-03-03');
-- INSERT INTO patient (id, name, email, address, registration_date, date_of_birth) VALUES
-- ("999e4178-3f24-48b8-94e5-399db89eb258", 'Bob Brown', 'bob.brown@example.com', '321 Maple St, Newtown, USA', '2023-01-04', '1975-04-04'),
-- ("999e4178-3f24-48b8-94e5-399db89eb259", 'Carol White', 'carol.white@example.com', '654 Cedar St, Oldtown, USA', '2023-01-05', '1988-05-05'),
-- ("999e4178-3f24-48b8-94e5-399db89eb260", 'David Black', 'david.black@example.com', '987 Birch St, Smalltown, USA', '2023-01-06', '1992-06-06');