package com.hee462.student.exec;

import com.hee462.student.impl.StudentServiceImplV2;
import com.hee462.student.service.StudentService;

public class StudentExecF {
	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV2();
		stService.loadStudent();
		stService.printStudent();
		stService.insertStudent();
	}
}
