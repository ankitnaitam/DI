package com.BikkadIT.DI.constructorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DI.constructorDao.TeacherDao;

@Service
public class TeacherService {

	private TeacherDao teacherDao;

	@Autowired
	public TeacherService(TeacherDao teacherDao) {
		super();
		System.out.println("Teacher Service Constructor+++++");
		this.teacherDao = teacherDao;
	}

	public void serviceMethod() {
		System.out.println("Teacher Service Method-------");
		teacherDao.daoMethod();
	}

}
