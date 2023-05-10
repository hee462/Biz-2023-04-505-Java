package com.hee462.classes.exec;

import com.hee462.classes.service.StudentService;
import com.hee462.classes.service.impl.StudentServiceImplV2;

public class StudetnExecE {
	public static void main(String[] args) {
		StudentService StService = new StudentServiceImplV2();
		StService.loadStudent();
		StService.printStudent();
		
	}
}
