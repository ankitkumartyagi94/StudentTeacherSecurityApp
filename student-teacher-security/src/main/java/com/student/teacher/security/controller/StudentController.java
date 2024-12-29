package com.student.teacher.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.teacher.security.domain.Student;
import com.student.teacher.security.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getStudentByRollNumber/{rollNumber}")
	public Student getOneStudent(@PathVariable(value = "rollNumber") String rollNumber) {
		return studentService.getStudent(rollNumber);
	}

	@GetMapping("/teacher/getStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}

}