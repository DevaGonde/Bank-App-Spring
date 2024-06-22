<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank App Spring</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        code {
            background: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        pre {
            background: #f4f4f4;
            padding: 10px;
            border-radius: 4px;
            overflow-x: auto;
        }
        .code-block {
            background: #f4f4f4;
            padding: 10px;
            border-radius: 4px;
            margin-bottom: 20px;
        }
        .container {
            width: 80%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Bank App Spring</h1>
        <p>This project is a simple bank application built with Spring Boot, Spring Data JPA, and MySQL. It performs basic banking operations such as adding an account, deleting an account, depositing money, withdrawing money, and finding all accounts. The application uses Spring MVC for handling web requests.</p>
        
        <h2>Features</h2>
        <ul>
            <li>Add a new account</li>
            <li>Delete an account</li>
            <li>Deposit money into an account</li>
            <li>Withdraw money from an account</li>
            <li>Retrieve all accounts</li>
        </ul>
        
        <h2>Technologies Used</h2>
        <ul>
            <li>Spring Boot</li>
            <li>Spring Data JPA</li>
            <li>Spring MVC</li>
            <li>MySQL</li>
            <li>Maven</li>
        </ul>
        
        <h2>Prerequisites</h2>
        <ul>
            <li>Java 11 or higher</li>
            <li>Maven</li>
            <li>MySQL database</li>
        </ul>
        
        <h2>Setup</h2>
        
        <h3>1. Clone the Repository</h3>
        <pre class="code-block">
git clone https://github.com/DevaGonde/Bank-App-Spring.git
cd Bank-App-Spring
        </pre>
        
        <h3>2. Configure MySQL Database</h3>
        <p>Create a MySQL database named <code>bank_app</code> and update the <code>application.properties</code> file with your MySQL username and password.</p>
        <pre class="code-block">
spring.datasource.url=jdbc:mysql://localhost:3306/bank_app
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
        </pre>
        
        <h3>3. Build and Run the Application</h3>
        <pre class="code-block">
mvn clean install
mvn spring-boot:run
        </pre>
        <p>The application will start running at <code>http://localhost:8080</code>.</p>
        
        <h2>API Endpoints</h2>
        
        <h3>1. Add a New Account</h3>
        <p><strong>URL:</strong> <code>/account</code></p>
        <p><strong>Method:</strong> <code>POST</code></p>
        <p><strong>Request Body:</strong></p>
        <pre class="code-block">
{
    "accountHolderName": "Deva",
    "balance": 10000
}
        </pre>
        <p><strong>Response:</strong></p>
        <pre class="code-block">
{
    "id": 1,
    "accountHolderName": "Deva",
    "balance": 10000
}
        </pre>
        
        <h3>2. Delete an Account</h3>
        <p><strong>URL:</strong> <code>/account/{id}/delete</code></p>
        <p><strong>Method:</strong> <code>DELETE</code></p>
        <p><strong>Response:</strong> <code>200 OK</code></p>
        <pre class="code-block">
{
    "message": "Account Deleted Successfully"
}
        </pre>
        
        <h3>3. Deposit Money</h3>
        <p><strong>URL:</strong> <code>/account/{id}/deposit</code></p>
        <p><strong>Method:</strong> <code>PUT</code></p>
        <p><strong>Request Body:</strong></p>
        <pre class="code-block">
{
    "amount": 500
}
        </pre>
        <p><strong>Response:</strong></p>
        <pre class="code-block">
{
    "id": 1,
    "accountHolderName": "Deva",
    "balance": 10500
}
        </pre>
        
        <h3>4. Withdraw Money</h3>
        <p><strong>URL:</strong> <code>/account/{id}/withdraw</code></p>
        <p><strong>Method:</strong> <code>PUT</code></p>
        <p><strong>Request Body:</strong></p>
        <pre class="code-block">
{
    "amount": 300
}
        </pre>
        <p><strong>Response:</strong></p>
        <pre class="code-block">
{
    "id": 1,
    "accountHolderName": "Deva",
    "balance": 9700
}
        </pre>
        
        <h3>5. Find All Accounts</h3>
        <p><strong>URL:</strong> <code>/account/getAll</code></p>
        <p><strong>Method:</strong> <code>GET</code></p>
        <p><strong>Response:</strong></p>
        <pre class="code-block">
[
    {
        "id": 1,
        "accountHolderName": "Deva",
        "balance": 9700
    }
]
        </pre>
        
        <h3>6. Find Account By ID</h3>
        <p><strong>URL:</strong> <code>/account/{id}</code></p>
        <p><strong>Method:</strong> <code>GET</code></p>
        <p><strong>Response:</strong></p>
        <pre class="code-block">
{
    "id": 1,
    "accountHolderName": "Deva",
    "balance": 9700
}
        </pre>
        
        <h2>Project Structure</h2>
        <pre class="code-block">
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
        </pre>
        
        <h2>Implementation Details</h2>
        <ul>
            <li><strong>Account Entity:</strong> Defines the account model with fields such as <code>id</code>, <code>accountHolderName</code>, and <code>balance</code>.</li>
            <li><strong>Account DTO:</strong> Used for data transfer with fields <code>id</code>, <code>accountHolderName</code>, and <code>balance</code>.</li>
            <li><strong>Account Repository:</strong> Extends <code>JpaRepository</code> for CRUD operations.</li>
            <li><strong>Account Service:</strong> Contains business logic for adding, deleting, depositing, withdrawing, and finding accounts.</li>
            <li><strong>Account Controller:</strong> Handles HTTP requests and maps them to service methods.</li>
            <li><strong>ModelMapper Configuration:</strong> Used to map entity to DTO and vice versa.</li>
        </ul>
        
        <h2>Author</h2>
        <ul>
            <li><strong>Name:</strong> Devendra R. Gonde</li>
            <li><strong>LinkedIn:</strong> <a href="https://linkedin.com/in/devendragonde/">linkedin.com/in/devendragonde/</a></li>
            <li><strong>GitHub:</strong> <a href="https://github.com/DevaGonde">github.com/DevaGonde</a></li>
        </ul>
    </div>
</body>
</html>
