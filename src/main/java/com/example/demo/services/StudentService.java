package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositries.StudentRepositry;


@Service
public class StudentService {

	@Autowired
	StudentRepositry student_repo;
	
	public List<Student> getAll(){
		return student_repo.findAll();
	}
	
	public Student insertStudent(Student s) {
		return student_repo.save(s);
		
	}
	
	public void deleteStudent(int id) {
		student_repo.deleteById(id);
	}
	
	public Student updateStudent(Student s) {
		student_repo.save(s);
		return s;
	}
	
}
