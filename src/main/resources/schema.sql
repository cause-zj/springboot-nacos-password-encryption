DROP TABLE IF EXISTS test_data_app;

CREATE TABLE test_data_app (
    id         BIGINT       NOT NULL AUTO_INCREMENT,
    name       VARCHAR(128) NOT NULL,
    category   VARCHAR(64)  NOT NULL,
    remark     VARCHAR(512) NULL,
    created_at DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
