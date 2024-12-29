package com.student.teacher.security.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.student.teacher.security.domain.Student;

@Component
public class StudentDTO {
	
	public List<Student> getAllStudentList() {
		List<Student> listStudent = new ArrayList<>();
		listStudent.add(new Student("Ankit", "123", "Class 10"));
		listStudent.add(new Student("Kumar", "456", "Class 11"));
		listStudent.add(new Student("Tyagi", "789", "Class 12"));
		return listStudent;
	}

}
