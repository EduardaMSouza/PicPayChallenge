CREATE TABLE IF NOT EXISTS transactions(
    uuid VARCHAR(36) PRIMARY KEY,
    payer_account_uuid VARCHAR(36) NOT NULL,
    payee_account_uuid VARCHAR(36) NOT NULL,
    value DECIMAL NOT NULL,
    FOREIGN KEY (payer_account_uuid) REFERENCES accounts(uuid),
    FOREIGN KEY (payee_account_uuid) REFERENCES accounts(uuid)
)CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci;