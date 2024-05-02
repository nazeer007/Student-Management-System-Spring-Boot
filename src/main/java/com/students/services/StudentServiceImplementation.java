package com.students.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entities.Student;
import com.students.repositories.StudentRepository;

@Service
public class StudentServiceImplementation 
		implements StudentServices{
	@Autowired
	StudentRepository repo;
	@Override
	public String addStudent(Student st) {
		repo.save(st);
		return "Student added successfully!";
	}
	
	public String updateStudent(Student st) {
		repo.save(st);
		return "Student updated Successfully!";
	}

	@Override
	public String deleteStudent(int univId) {
		repo.deleteById(univId);
		return "Student deleted Successfully!";
	}

    @Override
    public Student fetchStudentById(int univId) {
        Optional<Student> optionalStudent = repo.findById(univId);
        return optionalStudent.orElse(null);
    }

	@Override
	public List<Student> fetchAllStudents() {
		return repo.findAll();
	}	
}
