# springboot-nacos-password-encryption

Spring Boot 3.5.16 示例工程，使用 JDK 21 与 Maven。分层为 `controller`、`service`、`dao`、`domain`，通过 MyBatis-Plus 读取 MySQL 表 `test_data_app`。

本地开发库（仅本机）：

- URL: `jdbc:mysql://localhost:3306/app`
- 用户名: `root`
- 密码: `devroot`

## 准备数据库

先创建库。建表和示例数据由 Spring Boot 在启动时执行 `schema.sql` 与 `data.sql`（每次启动会重建 `test_data_app` 并重新写入示例行）。

```bash
mysql -uroot -pdevroot < src/main/resources/db/create-database.sql
```

## 构建与启动

需要 JDK 21 与 Maven。

```bash
mvn -DskipTests package
mvn spring-boot:run
```

## 接口

- `GET /api/ping`、`GET /api/health`：应用存活检查
- `GET /api/test-data`：返回 `test_data_app` 中的示例行

```bash
curl http://localhost:8080/api/ping
curl http://localhost:8080/api/test-data
```
