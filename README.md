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
   ```
3. Create the `students` table:
   ```sql
   USE student_db;
   CREATE TABLE students (
       id INT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       age INT NOT NULL,
       course VARCHAR(100) NOT NULL
   );
   ```
4. Update the database credentials in `src/com/college/sms/util/DBConnection.java` if necessary:
   - Default URL: `jdbc:mysql://localhost:3306/student_db`
   - Default User: `root`
   - Default Password: `***********`

## How to Run

1. **Compile the project** (Windows):
   ```
   javac -cp "lib\mysql-connector-j-9.5.0.jar" -d bin src\com\college\sms\dao\StudentDAO.java src\com\college\sms\exception\StudentNotFoundException.java src\com\college\sms\main\MainApp.java src\com\college\sms\model\Student.java src\com\college\sms\service\StudentService.java src\com\college\sms\util\DBConnection.java src\com\college\sms\util\FileInputputStream.java src\com\college\sms\util\FileUtil.java
   ```

2. **Run the application** (Windows):
   ```
   java -cp "bin;lib\mysql-connector-j-9.5.0.jar" com.college.sms.main.MainApp
   ```

   For Unix/Linux/Mac, replace backslashes `\` with forward slashes `/` and semicolons `;` with colons `:`.

## Project Structure

```
StudentManagementSystem/
├── README.md
├── bin/                    # Compiled class files
├── lib/                    # Dependencies (MySQL Connector/J)
└── src/
    ├── App.java           # Default app (not used)
    └── com/college/sms/
        ├── dao/           # Data Access Objects
        │   └── StudentDAO.java
        ├── exception/     # Custom exceptions
        │   └── StudentNotFoundException.java
        ├── main/          # Application entry point
        │   └── MainApp.java
        ├── model/         # Data models
        │   └── Student.java
        ├── service/       # Business logic
        │   └── StudentService.java
        └── util/          # Utility classes
            ├── DBConnection.java
            ├── FileInputputStream.java
            └── FileUtil.java
```

## Technologies Used

- **Java**: Core programming language
- **MySQL**: Database for data persistence
- **JDBC**: For database connectivity

## Contributing

Feel free to fork this project and submit pull requests for improvements.

## License

This project is open-source and available under the MIT License.
