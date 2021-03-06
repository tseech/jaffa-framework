CREATE TABLE USERS (
        USER_NAME          VARCHAR(50) NOT NULL,
        FIRST_NAME          VARCHAR(50) NOT NULL,
        LAST_NAME          VARCHAR(50) NOT NULL,
        PASSWORD          VARCHAR(80) NOT NULL,
        STATUS          VARCHAR(1) NOT NULL,
        E_MAIL_ADDRESS          VARCHAR(75),
        SECURITY_QUESTION          BIGINT,
        SECURITY_ANSWER          VARCHAR(50),
        CREATED_DATETIME          DATETIME,
        CREATED_USER          VARCHAR(50),
        LAST_UPDATE_DATETIME          DATETIME,
        LAST_UPDATE_USER          VARCHAR(50),
    CONSTRAINT USERSP1 PRIMARY KEY(USER_NAME)
) TYPE=InnoDB
