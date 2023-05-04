package com.BikkadIT.DI.constructorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

	@Autowired
	public TeacherDao() {
		super();
		System.out.println("Teacher Dao Constructor++++++");
	}

	public void daoMethod() {
		System.out.println("Teacher Dao Method-------");
	}
	
}
