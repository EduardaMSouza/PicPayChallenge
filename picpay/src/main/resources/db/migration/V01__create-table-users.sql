CREATE TABLE IF NOT EXISTS users(
    uuid VARCHAR(36) PRIMARY KEY ,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
)CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci;