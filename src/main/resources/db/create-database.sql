-- One-shot local setup. Run once before the first application start.
-- Table DDL and seed rows are applied by Spring Boot from schema.sql and data.sql.
CREATE DATABASE IF NOT EXISTS app
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_unicode_ci;
