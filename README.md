# Course Registration System

A full-stack **Course Registration System** developed using **Java, Spring Boot, Spring Security, HTML, CSS, JavaScript, and MySQL**. The application allows users to securely manage students and courses through a simple web interface and RESTful APIs.

---

## 🚀 Features

- User Registration and Login
- Secure Authentication with Spring Security
- BCrypt Password Encryption
- Student Management
- Course Management
- Course Registration
- CRUD Operations
- RESTful API Development
- Responsive User Interface
- MySQL Database Integration
- API Testing using Postman

---

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- REST API

### Frontend
- HTML5
- CSS3
- JavaScript

### Database
- MySQL

### Tools
- Postman
- Git
- GitHub
- IntelliJ IDEA / Eclipse
- VS Code

---

## 🔐 Security

- Spring Security Authentication
- BCrypt Password Encryption
- Secure Password Storage
- Protected REST APIs

---

## 📌 REST APIs

### Authentication
- POST `/register`
- POST `/login`

### Student APIs
- GET `/students`
- GET `/students/{id}`
- POST `/students`
- PUT `/students/{id}`
- DELETE `/students/{id}`

### Course APIs
- GET `/courses`
- GET `/courses/{id}`
- POST `/courses`
- PUT `/courses/{id}`
- DELETE `/courses/{id}`

---

## 🗄️ Database

MySQL is used as the relational database.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/course_registration
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run

### Backend

1. Clone the repository.
2. Open the project in IntelliJ IDEA or Eclipse.
3. Configure MySQL in `application.properties`.
4. Run the Spring Boot application.

### Frontend

1. Open the HTML files in your browser, **or**
2. Serve them using Live Server in VS Code.

Backend URL:

```
http://localhost:8080
```

---
## 👨‍💻 Author

**Venkatesan R**

Java Full Stack Developer

### Skills
- Java
- Spring Boot
- Spring Security
- HTML
- CSS
- JavaScript
- MySQL
- REST API
- Git & GitHub

---

## ⭐ Future Enhancements

- JWT Authentication
- Role-Based Access Control (Admin & Student)
- Email Verification
- Forgot Password
- Search and Filter Courses
- Dashboard Analytics
- Docker Deployment
