# 🚀 Task Management System (Spring Boot + PostgreSQL)

A fully functional backend application built using **Spring Boot**, designed to manage users and tasks with secure authentication and a clean layered architecture.

---

# 📌 Project Overview

This project is a **RESTful Task Management System** that allows users to:

* Register and login securely
* Create and manage tasks
* Store and retrieve data from PostgreSQL database
* Follow a scalable backend architecture

The system demonstrates **real-world backend development practices** including API design, database integration, and security.

---

# 🧱 Architecture

The project follows a **Layered Architecture**:

```
Controller → Service → Repository → Database
```

### 🔹 Controller Layer

Handles HTTP requests and responses

### 🔹 Service Layer

Contains business logic

### 🔹 Repository Layer

Handles database operations using JPA

### 🔹 Model Layer

Defines entities (User, Task)

---

# 🛠️ Tech Stack

| Technology      | Purpose                   |
| --------------- | ------------------------- |
| Java            | Core programming language |
| Spring Boot     | Backend framework         |
| Spring Data JPA | Database interaction      |
| PostgreSQL      | Relational database       |
| Maven           | Dependency management     |
| BCrypt          | Password encryption       |
| Postman         | API testing               |

---

# 📁 Project Structure

```
task-manager/
│
├── src/main/java/com/pradhuman/taskmanager/
│   ├── controller/
│   │   ├── UserController.java
│   │   └── TaskController.java
│   │
│   ├── service/
│   │   ├── UserService.java
│   │   └── TaskService.java
│   │
│   ├── repository/
│   │   ├── UserRepository.java
│   │   └── TaskRepository.java
│   │
│   ├── model/
│   │   ├── User.java
│   │   └── Task.java
│   │
│   └── TaskmanagerApplication.java
│
├── src/main/resources/
│   └── application.yml
│
├── pom.xml
└── README.md
```

---

# 🔐 Features

## 👤 User Management

* Register new users
* Login with encrypted password
* Password stored securely using **BCrypt hashing**

## 📋 Task Management

* Create new tasks
* Retrieve all tasks
* Task fields:

  * Title
  * Description
  * Status (PENDING / COMPLETED)

## 🔒 Security

* Password encryption using BCrypt
* Clean separation of authentication logic

---

# 🌐 API Endpoints

## 🔹 User APIs

### ✅ Register User

```
POST /users/register
```

**Request Body:**

```json
{
  "username": "user1",
  "name": "Test",
  "email": "test@gmail.com",
  "password": "1234"
}
```

---

### ✅ Login User

```
POST /users/login
```

**Request Body:**

```json
{
  "username": "user1",
  "password": "1234"
}
```

**Response:**

```
SUCCESS or FAIL
```

---

### ✅ Get All Users

```
GET /users/all
```

---

## 🔹 Task APIs

### ✅ Create Task

```
POST /tasks
```

**Request Body:**

```json
{
  "title": "Complete Project",
  "description": "Finish backend",
  "status": "PENDING"
}
```

---

### ✅ Get All Tasks

```
GET /tasks
```

---

# ⚙️ Configuration

## 🔹 Database Setup (PostgreSQL)

Update `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/taskmanager
    username: postgres
    password: 1234

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

---

# ▶️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/PRADHUMAN-SINGH-1/task-manager.git
cd task-manager
```

---

### 2️⃣ Install dependencies

```bash
./mvnw clean install
```

---

### 3️⃣ Run the application

```bash
./mvnw spring-boot:run
```

---

### 4️⃣ Test APIs

Use:

* Postman
* Browser (for GET APIs)

Base URL:

```
http://localhost:8080
```

---

# 🧪 Testing

All APIs were tested using **Postman**:

* Verified user registration and login
* Verified password encryption
* Verified task creation and retrieval

---

# 🚀 Future Improvements

* JWT Authentication
* Role-Based Access Control (RBAC)
* Task update & delete APIs
* Frontend integration (React)
* Deployment (AWS / Render)

---

# 👨‍💻 Author

**Pradhuman Singh**

* Full Stack Developer
* Skilled in Spring Boot, React, Node.js

---

# ⭐ Conclusion

This project demonstrates:

* Strong backend fundamentals
* Clean architecture design
* Secure authentication practices
* Real-world API development

---

🔥 *Ready for internships, placements, and technical interviews*
