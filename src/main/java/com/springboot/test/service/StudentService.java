package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.Student;
import com.springboot.test.exception.ResourceNotFoundException;
import com.springboot.test.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> addStudents(List<Student> students)
	{
		return studentRepository.saveAll(students);
	}
	
	public List<Student> getStudents()
	{
		return studentRepository.findAll();
	}
	
	public Student getStudentById(int id)
	{
		return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not in the database"+id));
	}

}
