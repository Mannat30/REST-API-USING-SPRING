package com.student.api.service;
import org.springframework.stereotype.Service;
import com.student.api.model.Student;
@Service
public class StudentService {
	public Student getStudent() {
		return new Student(1,"jannat","Spring Boot");
	}
	

}
