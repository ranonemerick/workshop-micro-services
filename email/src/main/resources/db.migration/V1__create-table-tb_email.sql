CREATE TABLE tb_emails (
    email_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID,
    email_from VARCHAR(255),
    email_to VARCHAR(255),
    subject VARCHAR(255),
    text TEXT,
    send_date_email TIMESTAMP,
    status_email VARCHAR(50)
);
