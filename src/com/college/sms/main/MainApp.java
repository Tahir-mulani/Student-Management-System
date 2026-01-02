package com.college.sms.main;

import com.college.sms.service.StudentService;
import java.util.Scanner;

public class MainApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        int choice;
        
        do{
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("0. Exit");
            System.out.println("Enter Your choice: ");
            
            choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                    service.addStudent();
                    break;
                
                case 2:
                    service.viewAllStudents();
                    break;
                
                case 3:
                    service.searchStudent();
                    break;

                case 4:
                    service.deleteStudent();
                    break;
                
                case 5:
                    service.updateStudent();
                    break;


                case 0:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 0);

        sc.close();
    }
}
