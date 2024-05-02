package com.students.services;

import java.util.List;

import com.students.entities.Student;

public interface StudentServices {
	String addStudent(Student st);
	String updateStudent(Student st);
	String deleteStudent(int univId);
	List<Student> fetchAllStudents();
	Student fetchStudentById(int univId);
}
