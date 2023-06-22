//interface used to define the methods
//Student - Entity class
//student- object of entity class Student
//List - interface 
package com.maven.dao;

import java.util.List;

import com.maven.model.Student;

public interface IStudentDao 
{
	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudents();

	void deleteStudent(long id);
}
