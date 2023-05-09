package com.hee462.classes.exec;

import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.impl.StudentServiceImplV1;

public class StudentD {
	public static void main(String[] args) {
		StudentServiceImplV1 stService = new StudentServiceImplV1();
		stService.loadStudent();
		stService.printStudent();
		StudentDto stDto = stService.getStudent("S0005");
		System.out.println(stDto.toString());

	}
}
