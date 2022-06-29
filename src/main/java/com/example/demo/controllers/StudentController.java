package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;



@RestController
public class StudentController {

	@Autowired
	StudentService student_service;
	
	@GetMapping("/display_all_students")
	public List<Student> getAll(){
		return student_service.getAll();
	}
	
	@PostMapping("/insert_student")
	public Student insertStudent(@RequestBody Student s) {
		return student_service.insertStudent(s);
	}
}
