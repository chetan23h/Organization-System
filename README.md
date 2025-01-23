Employee Data Management Application
Overview
A Spring Boot application for managing employee data using JPA and MySQL, providing REST endpoints to fetch employee information.
Features

Retrieve all employees
Fetch employee by ID
Uses Spring Boot, JPA, and MySQL
RESTful API endpoints

Prerequisites

Java 11+
Maven
MySQL Database

Project Structure
CopyEmployeeDataApp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.demo
│   │   │       ├── Employee.java
│   │   │       ├── EmployeeService.java
│   │   │       ├── EmployeeController.java
│   │   │       └── EmployeeRepository.java
│   │   └── resources
│   │       └── application.properties
└── pom.xml
Configuration

Create MySQL database:

sqlCopyCREATE DATABASE kodnestemp;

Update application.properties:


Database URL
Username
Password

Dependencies

Spring Boot Starter Data JPA
Spring Boot Starter Web
MySQL Connector
Spring Boot DevTools

Running the Application
bashCopymvn spring-boot:run
API Endpoints

GET /employees: Retrieve all employees
GET /employee/{id}: Retrieve employee by ID

Database Configuration

MySQL database
Hibernate auto-update
SQL logging enabled
