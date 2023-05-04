package com.BikkadIT.DI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DI.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	public void controllerLayer() {
		System.out.println("Student Controller Layer...");
		
		studentService.serviceLayer();
	}
	
	
}
