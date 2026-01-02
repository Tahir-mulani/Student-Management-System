package com.college.sms.dao;

import com.college.sms.model.Student;
import com.college.sms.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    // ADD STUDENT
    public boolean addStudent(Student student) {

        String sql = "INSERT INTO students (id, name, age, course) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getCourse());

            ps.executeUpdate();
            return true;   // ✅ Insert success

        } catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate primary key (ID)
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // VIEW ALL STUDENTS
    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course")
                );
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // SEARCH STUDENT BY ID
    public Student findById(int id) {

        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    // DELETE STUDENT
    public boolean deleteById(int id) {

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // UPDATE STUDENT
    public boolean updateStudent(int id, String name, int age, String course) {

        String sql = "UPDATE students SET name=?, age=?, course=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.setInt(4, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
