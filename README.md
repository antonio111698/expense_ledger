# Expense Ledger

Easily log your daily expenses and keep a clear overview of your finances.


## Why it exists

I've created this app because by now I had my spendings logged on Notes app from my Phone and then I had to insert them into an Excel file.
This come very handy because from now they are added only once and in one place, and you can filter them, sort them, and a lot of calculation that will come handy for every user.

## Stack

Java 21, Spring Boot, Thymeleaf, Spring Data JPA + Hibernate, Flyway, Bootstrap.
PostgreSQL in production, H2 locally.


## Status

In development. Built as a learning project.


## Running it locally

**Requirements:** Java 21. Nothing else — Maven ships with the project via the
wrapper script, so there is no separate install.

```bash
git clone <this-repo>
cd Expense_Ledger
.\mvnw.cmd spring-boot:run
```

On macOS or Linux use `./mvnw spring-boot:run` instead.

The first run downloads Maven and all dependencies and takes a few minutes.
Later runs start in a couple of seconds.

The app is then available at **http://localhost:8080**. Stop it with `Ctrl+C`.
