package com.college.sms.service;

import com.college.sms.dao.StudentDAO;
import com.college.sms.model.Student;

import java.util.Scanner;

public class StudentService {

    private StudentDAO dao = new StudentDAO();
    private Scanner sc = new Scanner(System.in);

    // ADD STUDENT
    public void addStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        boolean added = dao.addStudent(new Student(id, name, age, course));

        if (added) {
            System.out.println("✅ Student added successfully!");
        } else {
            System.out.println("❌ Student with this ID already exists!");
        }
    }

    // VIEW ALL STUDENTS
    public void viewAllStudents() {
        if (dao.getAllStudents().isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("ID | Name | Age | Course");
        System.out.println("------------------------");

        dao.getAllStudents().forEach(Student::display);
    }

    // SEARCH STUDENT
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = dao.findById(id);

        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found!");
        }
    }

    // DELETE STUDENT
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (dao.deleteById(id)) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // UPDATE STUDENT
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Course: ");
        String course = sc.nextLine();

        if (dao.updateStudent(id, name, age, course)) {
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}
