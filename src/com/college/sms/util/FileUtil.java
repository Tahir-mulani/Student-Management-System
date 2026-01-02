package com.college.sms.util;

import com.college.sms.model.Student;
import java.io.*;
import java.util.ArrayList;

public class FileUtil {

    private static final String FILE_NAME = "students.dat";

    public static void saveToFile(ArrayList<Student> students) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Student> loadFromFile() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            return (ArrayList<Student>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
