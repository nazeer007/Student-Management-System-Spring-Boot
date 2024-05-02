package com.students.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.students.entities.Student;
import com.students.services.StudentServices;

@Controller
public class StudentController {
	
	@Autowired
	StudentServices service;
	@PostMapping("/reg")
	public String addStudent(Student st) {
		service.addStudent(st);
		return "index";
	}
	
	@PostMapping("/upd")
	public String updateStudent(Student st) {
		service.updateStudent(st);
		return "index";
	}
	@PostMapping("/del")
	public String deleteStudent(@RequestParam("univID") int univID) {
		service.deleteStudent(univID);
		return "index";
	}

	 @GetMapping("/showSearchPage")
	    public String showSearchPage() {
	        return "searchStudent"; // Return the searchStudent.html page
	    }

	    @GetMapping("/displayPage")
	    public String showDisplayPage() {
	        return "displayStudent"; // Return the displayStudent.html page
	    }

	    @GetMapping("/fetchById")
	    public String fetchStudentById(@RequestParam("univId") int univId, Model model) {
	        Student student = service.fetchStudentById(univId);
	        if (student != null) {
	            model.addAttribute("student", student);
	            return "displayStudent"; // Return the displayStudent.html page with student details
	        } else {
	            return "errorPage"; // Handle error if student not found
	        }
	    }
	
	
	@GetMapping("/fetchAll")
	public String fetchAllStudents(Model m) {
		List<Student> sList = service.fetchAllStudents();
		m.addAttribute("stList",sList);
		return "displayAllStudents";
	}
}
