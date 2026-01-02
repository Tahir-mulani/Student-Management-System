package com.college.sms.model;

import java.io.Serializable;

public class Student implements Serializable {
   private static final long serialVersionUID = 1L;;

    private int id;
    private String name;
    private int age;
    private String course;

    public Student(){}

    public Student(int id,String name, int age,String course){
        this.id= id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

     

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
   
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    public void display(){
        System.out.println(id + "  |  " + name + "  |  " + age + "  |  " + course);
    }


}