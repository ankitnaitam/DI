package com.BikkadIT.DI.setterController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DI.setterService.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void controllerLayer() {
		System.out.println("Employee Controller Layer.........");

		employeeService.serviceLayer();
	}

}
