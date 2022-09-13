package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.Student;
import com.springboot.test.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addstudents")
	public List<Student> addStudents(@RequestBody List<Student> students)
	{
		return studentService.addStudents(students);
	}
	
	@GetMapping("/getstudents")
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	
	@GetMapping("/getstudentById/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}

}
