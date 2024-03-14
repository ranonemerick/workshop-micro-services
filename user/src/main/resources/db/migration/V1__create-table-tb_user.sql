CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE TB_USERS (
    user_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name VARCHAR(255),
    email VARCHAR(255)
);
