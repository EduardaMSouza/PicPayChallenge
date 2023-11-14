CREATE TABLE transactions(
    uuid UUID PRIMARY KEY,
    payer_account_uuid VARCHAR(255) NOT NULL,
    payee_account_uuid VARCHAR(255) NOT NULL,
    value DECIMAL NOT NULL,
    FOREIGN KEY (payee_account_uuid, payee_account_uuid) REFERENCES users(uuid)
)CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci;