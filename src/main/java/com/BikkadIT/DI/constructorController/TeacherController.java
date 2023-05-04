package com.BikkadIT.DI.constructorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DI.constructorService.TeacherService;

@Controller
public class TeacherController {

	private TeacherService teacherService;
	
	@Autowired //When there is only one constructor @Autowired annotation is optional
	public TeacherController(TeacherService teacherService) {
		super();
		System.out.println("Teacher Controller Constructor+++++");
		this.teacherService = teacherService;
	}

	public void controllerMethod() {
		System.out.println("Teacher Controller Method-------");
		
		teacherService.serviceMethod();
	}
	
}
