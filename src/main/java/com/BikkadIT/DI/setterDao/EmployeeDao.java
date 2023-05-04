package com.BikkadIT.DI.setterDao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	public EmployeeDao() {
		super();
		System.out.println("Employee dao constructor=========");
	}

	public void daoLayer() {
		System.out.println("Employee Dao Layer.........");
	}

}
