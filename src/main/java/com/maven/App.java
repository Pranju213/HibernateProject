package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student=new Student("Prajkta","Shinde","prajkta123@gmail.com");
        Student student1 =new Student("Om","Shinde","om123@gmail.com");
        Student student2 =new Student("Shrawani","Hole","shrawani123@gmail.com");
        //passing value in parameterized constructor
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        
        // test updateStudent
        student.setFirstName("Priyanka");
        studentDao.updateStudent(student);
        
        student.setEmail("priya123@gmail.com");
        studentDao.updateStudent(student);
        
        student1.setFirstName("Prashant");
        studentDao.updateStudent(student1);
        
        student1.setEmail("Prash123@gmail.com");
        studentDao.updateStudent(student1);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        students.forEach(student3 -> System.out.println(student2.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
        studentDao.deleteStudent(1);

    }
    }



