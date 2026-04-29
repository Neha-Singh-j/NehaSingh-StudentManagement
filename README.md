#  Student Management System (Spring Boot + JDBC + PostgreSQL)

## Project Description

This project is a **Spring Boot application** that connects to a **PostgreSQL database** using **JDBC (JdbcTemplate)** and performs **CRUD operations** on a Student table.

A simple **frontend UI (HTML, CSS, JavaScript)** is also integrated to interact with the backend APIs.

---

##  Features

###  Backend (Spring Boot + JDBC)

* Create a new student
* Fetch all students
* Fetch student by ID
* Update student details
* Delete student record

###  Frontend

* Add student using form
* View all students
* Edit & update student
* Delete student
* Modern dashboard-style UI

---

##  Technologies Used

* Java 21
* Spring Boot
* JdbcTemplate (JDBC)
* PostgreSQL
* HTML, CSS, JavaScript

---

##  Database Setup (PostgreSQL)

### 1. Create Database

```sql
CREATE DATABASE exam2;
```

### 2. Create Table

```sql
CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100)
);
```

---

##  Configuration (`application.properties`)

```properties
spring.application.name=examStudentM

spring.datasource.url=jdbc:postgresql://localhost:5432/exam2
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=none
```

---

##  Project Structure

```
com.example.examStudentM
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── ExamStudentMApplication.java
```


##  REST API Endpoints

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| POST   | /students      | Create student    |
| GET    | /students      | Get all students  |
| GET    | /students/{id} | Get student by ID |
| PUT    | /students/{id} | Update student    |
| DELETE | /students/{id} | Delete student    |

---

##  Frontend

Frontend is built using:

* HTML
* CSS (custom styled dashboard)
* JavaScript (Fetch API)

### Features:

* Form for adding/updating student
* List view of students
* Edit & Delete buttons
* Responsive layout

---

##  UI Preview
<img width="1363" height="591" alt="Screenshot 2026-04-29 152521" src="https://github.com/user-attachments/assets/1367e89f-3411-4083-8db4-25a11607b99f" />

---

##  How to Run

1. Clone the repository
2. Configure PostgreSQL credentials
3. Create database & table
4. Run Spring Boot application:

```
mvn spring-boot:run
```

5. Open browser:

```
http://localhost:8080/
```

---

##  Important Notes

* No Hibernate (pure JDBC used)
* SQL queries written manually
* Layered architecture followed:

  * Controller → Service → Repository

---

##  Conclusion

This project demonstrates:

* Integration of Spring Boot with PostgreSQL using JDBC
* Implementation of full CRUD operations
* REST API design
* Basic frontend integration

---

##  Author

Neha Singh
