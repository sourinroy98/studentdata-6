package com.springboot.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
