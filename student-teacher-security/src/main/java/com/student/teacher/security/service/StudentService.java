package com.student.teacher.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.teacher.security.domain.Student;
import com.student.teacher.security.dto.StudentDTO;

@Service
public class StudentService {
	
	@Autowired
	StudentDTO studentDTO;

	public Student getStudent(String rollNumber) {
		return studentDTO.getAllStudentList().stream().filter(ele -> ele.getRollNumber().equals(rollNumber)).findFirst().orElse(null);
	}

	public List<Student> getAllStudent() {
		return studentDTO.getAllStudentList();
	}
	
}
