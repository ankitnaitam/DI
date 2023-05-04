package com.BikkadIT.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.DI.constructorController.TeacherController;
import com.BikkadIT.DI.controller.StudentController;
import com.BikkadIT.DI.service.StudentService;
import com.BikkadIT.DI.setterController.EmployeeController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DiApplication.class,
				args);

		// Using Reference Variable
		StudentController studentController = configurableApplicationContext.getBean(StudentController.class);
		studentController.controllerLayer();

		// Using Setter
		EmployeeController employeeController = configurableApplicationContext.getBean(EmployeeController.class);
		employeeController.controllerLayer();

		//Using Constructor
		TeacherController teacherController = configurableApplicationContext.getBean(TeacherController.class);
		teacherController.controllerMethod();
		
	}

}
