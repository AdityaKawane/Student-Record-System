
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

| Technology   | Purpose                          |
|--------------|----------------------------------|
| Java         | Core application logic           |
| JDBC         | Database connectivity            |
| MySQL        | Persistent student data          |
| VS Code      | Development environment          |
| phpMyAdmin   | GUI for MySQL database           |
| Git & GitHub | Version control and collaboration|

---

## 🧑‍💻 Terminal Commands to Run the Project

> 💡 Make sure you're inside the project root folder and have the connector `.jar` in the `lib/` folder.

### 🔹 1. Compile

```bash
javac -cp "lib/mysql-connector-j-9.3.0.jar" src/*.java
```

### 🔹 2. Run

```bash
java -cp "lib/mysql-connector-j-9.3.0.jar;src" Main
```

> 📝 On Linux/macOS, replace `;` with `:` in the classpath.

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
```

---

## 📂 Project Structure

```
StudentRecordSystem/
│
├── lib/
│   └── mysql-connector-j-9.3.0.jar
│
├── src/
│   ├── DBUtil.java
│   ├── Main.java
│   ├── Student.java
│   └── StudentDAO.java
│
├── README.md
└── .gitignore (optional)
```

---

## 📄 Description

This project demonstrates:
- Java + JDBC integration
- Performing basic CRUD operations
- Object-oriented design using the DAO pattern
- Simple console-based interaction for student data management

Ideal for beginners looking to understand how Java applications connect to MySQL databases.

---

## 🔗 Author

**Aditya Kawane**  
📧 [adityakawane08@gmail.com]  
🔗 [linkedin.com/in/aditya-kawane-680004288](https://linkedin.com/in/aditya-kawane-680004288)

---

## 📝 License

This project is free for educational and personal use. Credit appreciated if reused or modified.
