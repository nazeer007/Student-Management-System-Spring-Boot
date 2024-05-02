package com.students.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("CurrentPage","index");
		return "index";
	}
	
	@GetMapping("/registerPage")
	public String register(Model model) {
		model.addAttribute("CurrentPage","addStudent");
		return "addStudent";
	}
	@GetMapping("/searchPage")
	public String search(Model model) {
		model.addAttribute("CurrentPage","searchStudent");
		return "searchStudent";
	}
	
	@GetMapping("/updatePage")
	public String update(Model model) {
		model.addAttribute("CurrentPage","updateStudent");
		return "updateStudent";
	}
	@GetMapping("/deletePage")
	public String delete(Model model) {
		model.addAttribute("CurrentPage","deleteStudent");
		return "deleteStudent";
	}


}
