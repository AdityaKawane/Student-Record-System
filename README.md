# 🎓 Student Record Management System (Java + MySQL + JDBC)

A simple console-based Java application to manage student records like roll number, name, branch, and marks. This project uses **JDBC** to connect to a **MySQL** database and supports basic CRUD operations.

---

## 📌 Features

- Add a new student
- View all students
- Update student marks
- Delete a student
- Exit the system

---

## 🛠️ Technologies Used

| Tech        | Purpose                        |
|-------------|--------------------------------|
| Java        | Core application logic         |
| JDBC        | Database connectivity          |
| MySQL       | Persistent student data        |
| VS Code     | Development environment        |
| phpMyAdmin  | GUI for MySQL database         |

---

## 🗃️ Database Schema

**Database Name:** `student_db`  
**Table Name:** `students`

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    roll_no INT PRIMARY KEY,
    name VARCHAR(100),
    branch VARCHAR(50),
    marks INT
);
