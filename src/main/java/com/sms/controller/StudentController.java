package com.sms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping("/")
	public String getHome(Model m) {

		List<Student> std = service.getAllStudent();

		m.addAttribute("std", std);
		
		return "index";
	}
	
	@GetMapping("/add")
	public String goAdd() {
		
		return "addstudent";
	}
	
	@PostMapping("/addstudent")
	public String addStudent(@ModelAttribute Student std) {
		service.addStd(std);
//		System.out.println(std);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String goEdit(@PathVariable int id, Model m) {
		
		Student std = service.getStudentById(id);
		m.addAttribute("std", std);
		
		return "edit";
	}
	
	@PostMapping("/editstudent")
	public String editStudent(@ModelAttribute Student std) {
		service.addStd(std);
		return "redirect:/";
	}
	

	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		service.delStudent(id);
		return "redirect:/";
	}
	
}
