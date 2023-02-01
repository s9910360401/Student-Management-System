package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.reposity.StudentReposity;

@Service
public class StudentService {
	
	@Autowired
	private StudentReposity studentRepo;
	
	public void addStd(Student std) {
		studentRepo.save(std);
	}
	
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
	
	public void delStudent(int id) {
		studentRepo.deleteById(id);
	}
	
	public Student getStudentById(int id) {
		Optional<Student> std = studentRepo.findById(id);
		if(std.isPresent()) {
			return std.get();
		}
		return null;
	}

}
