--liquibase formatted sql

--changeset rcastellor:master-tables


CREATE TABLE table_example (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(100)
);

