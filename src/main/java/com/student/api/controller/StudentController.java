
package com.student.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.api.model.Student;
import com.student.api.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/student")
	public Student getStudent() {
		return service.getStudent();
	}
	

}
