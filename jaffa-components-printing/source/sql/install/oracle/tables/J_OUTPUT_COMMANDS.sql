CREATE TABLE "J_OUTPUT_COMMANDS"(
        "OUTPUT_COMMAND_ID"          NUMBER(10) NOT NULL,
        "OUTPUT_TYPE"          VARCHAR2(20) NOT NULL,
        "SEQUENCE_NO"          NUMBER(10) NOT NULL,
        "OS_PATTERN"          VARCHAR2(255) NOT NULL,
        "COMMAND_LINE"          VARCHAR2(255) NOT NULL,
        "CREATED_ON"          DATE,
        "CREATED_BY"          VARCHAR2(20),
        "LAST_CHANGED_ON"          DATE,
        "LAST_CHANGED_BY"          VARCHAR2(20),
    CONSTRAINT "J_OUTPUT_COMMANDSP1" PRIMARY KEY("OUTPUT_COMMAND_ID")
)
/
