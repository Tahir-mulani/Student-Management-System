# 🎓 Student Management System (Java + MySQL)

A **console-based Java application** designed to manage student records using a **MySQL database**.  
This project demonstrates **Core Java, JDBC, MySQL integration**, and follows a **layered architecture** suitable for beginners and freshers.

---

## 📌 Project Overview

The **Student Management System** allows users to perform complete **CRUD operations** (Create, Read, Update, Delete) on student data through a simple **command-line interface**.

This project is ideal for:
- Java beginners
- JDBC & MySQL practice
- Understanding real-world database-driven applications
- Academic & interview preparation

---

## ✨ Features

- ➕ **Add Student** – Create new student records (ID, Name, Age, Course)
- 📋 **View All Students** – Display all stored student records
- 🔍 **Search Student** – Find student details by ID
- ✏️ **Update Student** – Modify existing student information
- ❌ **Delete Student** – Remove student records by ID
- ⚠️ **Custom Exception Handling** – Handles student-not-found scenarios

---

## 🧰 Technologies Used

- **Java (Core Java)**
- **MySQL**
- **JDBC (Java Database Connectivity)**
- **VS Code / Eclipse**
- **Git & GitHub**

---

## 📦 Prerequisites

Ensure the following are installed before running the project:

- Java Development Kit (**JDK 8 or above**)
- MySQL Server
- MySQL Connector/J (included in the `lib/` directory)

---

## 🗄️ Database Setup

1. Start MySQL Server
2. Create database:
   ```sql
   CREATE DATABASE student_db;

3.Create table: 
 
USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

4.Configure database connection in:
src/com/college/sms/util/DBConnection.java

- Default values:

URL: jdbc:mysql://localhost:3306/student_db
Username: root
Password: ********

▶️** How to Run the Project**
🔹 **Step 1: Compile (Windows)**
bash
Copy code
javac -cp "lib\mysql-connector-j-9.5.0.jar" -d bin ^
src\com\college\sms\dao\StudentDAO.java ^
src\com\college\sms\exception\StudentNotFoundException.java ^
src\com\college\sms\main\MainApp.java ^
src\com\college\sms\model\Student.java ^
src\com\college\sms\service\StudentService.java ^
src\com\college\sms\util\DBConnection.java ^
src\com\college\sms\util\FileInputputStream.java ^
src\com\college\sms\util\FileUtil.java
🔹 **Step 2: Run Application**
bash
Copy code
java -cp "bin;lib\mysql-connector-j-9.5.0.jar" com.college.sms.main.MainApp
💡 For Linux / macOS

Replace \ with /

Replace ; with :

📂** Project Structure**
bash
Copy code
StudentManagementSystem/
├── README.md
├── bin/                     # Compiled class files
├── lib/                     # MySQL Connector/J
└── src/
    └── com/college/sms/
        ├── dao/             # Database operations
        ├── exception/       # Custom exceptions
        ├── main/            # Application entry point
        ├── model/           # POJO classes
        ├── service/         # Business logic
        └── util/            # Utility classes
        
**🧠 Learning Outcomes**
Through this project, you will learn:

- JDBC connection handling
- SQL operations from Java
- Layered architecture (DAO, Service, Model)
- Exception handling
- Console-based user interaction
- Real-world CRUD application development

**🚀 Future Enhancements (Optional)**

- Input validation
- Login authentication
- GUI using JavaFX / Swing
- Logging support
- Pagination for records

**🤝 **Contributing****
This is a learning-focused project.
Feel free to:
- Fork the repository
- Suggest improvements
- Submit pull requests

## License 
This project is open-source and available under the MIT License.
