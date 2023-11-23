<h1 align = "center">Student App</h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
  <a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>

This project is a Student App  that allows users to manage cources and address. It provides endpoints for CRUD operations on students and course, with additional other model
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

<br>
The employee address  data model is fined the employee address has the following attributes:

* Student:
```
 * private String ID;
 * private String name;
 * private String age;
 * private String phoneNumber;
 * private String branch;
 * private String department;
 ```
* Laptop:
```
 * private String ID;
 * private String name;
 * private String brand;
 * private String price;
 ```

 * Course:
 ```
 * private String ID;
 * private String title;
 * private String description;
 * private String duratiom;
```
 * Book :
 ```
 * private String title;
 * private String author;
 * private String description;
 * private String price;
```
 * Address:
 ```
* private Long addressId;
* private String landmark;
* private String zipcode;
* private String district;
* private String state;
* private String country;
```
<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

---

# Project Summary
### The project is a basic web application built using Java and the Spring framework. this framwork used for get details of student...with tha help or create read updat and delete...
<br>
