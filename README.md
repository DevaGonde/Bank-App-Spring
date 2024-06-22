# Bank App Spring

This project is a simple bank application built with Spring Boot, Spring Data JPA, and MySQL. It performs basic banking operations such as adding an account, deleting an account, depositing money, withdrawing money, and finding all accounts. The application uses Spring MVC for handling web requests.

## Features

- Add a new account
- Delete an account
- Deposit money into an account
- Withdraw money from an account
- Retrieve all accounts

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring MVC
- MySQL
- Maven

## Prerequisites

- Java 11 or higher
- Maven
- MySQL database

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/DevaGonde/Bank-App-Spring.git
cd Bank-App-Spring
````

### Configure MySQL Database

Create a MySQL database named bank_app and update application.properties with your MySQL username and password.

````
spring.datasource.url=jdbc:mysql://localhost:3306/bank_app
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
````
# Build and Run the Application

````
mvn clean install
mvn spring-boot:run
````

## API Endpoints
# Add a New Account
- URL: /account
- Method: POST
Request Body:

json
````
{
  "accountHolderName": "Deva",
  "balance": 10000
}
````
# Delete an Account
- URL: /account/{id}/delete
- Method: DELETE
Deposit Money
- URL: /account/{id}/deposit
Method: PUT
Request Body:
````
json
Copy code
{
  "amount": 500
}
````
# Withdraw Money
- URL: /account/{id}/withdraw
- Method: PUT
- Request Body:
json
```
{
  "amount": 300
}
```
# Find All Accounts
- URL: /account/getAll
- Method: GET
- Find Account By ID
- URL: /account/{id}
- Method: GET

### Project Structure
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── Deva
│   │           └── Bank_app
│   │               ├── BankAppApplication.java
│   │               ├── controller
│   │               │   └── AccountController.java
│   │               ├── dto
│   │               │   └── AccountDto.java
│   │               ├── model
│   │               │   └── Account.java
│   │               ├── repository
│   │               │   └── AccountRepository.java
│   │               └── service
│   │                   └── AccountService.java
│   └── resources
│       ├── application.properties
│       └── data.sql
└── test
    └── java
        └── com
            └── Deva
                └── Bank_app
                    └── BankAppApplicationTests.java
```

## Author
- Name: Devendra R. Gonde
- LinkedIn: linkedin.com/in/devendragonde/
- GitHub: github.com/DevaGonde
