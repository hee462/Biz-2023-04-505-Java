package com.hee462.classes.exec;

import com.hee462.classes.service.StudentService;
import com.hee462.classes.service.impl.StudentServiceImplV4;


public class StudetnExecF {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV4();
		stService.loadStudent();
		stService.printStudent();
		
		System.out.println(stService.getStudent("S0010"));
		
		
	}
}
