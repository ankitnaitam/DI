package com.BikkadIT.DI.setterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DI.setterDao.EmployeeDao;

@Service
public class EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeService() {
		super();
		System.out.println("Employee service constructor==========");
	}

	public void serviceLayer() {
		System.out.println("Employee Service Layer.........");

		employeeDao.daoLayer();
	}

}
