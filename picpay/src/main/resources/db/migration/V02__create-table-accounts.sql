CREATE TABLE IF NOT EXISTS accounts (
    uuid VARCHAR(36) PRIMARY KEY,
    user_uuid VARCHAR(36) NOT NULL,
    bank_balance DECIMAL NOT NULL,
    FOREIGN KEY (user_uuid) REFERENCES users(uuid)
)CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci;