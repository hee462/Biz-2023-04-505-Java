package com.hee462.system.exec;

import com.hee462.scanner.model.StudentDto;

public class StudentB {
	public static void main(String[] args) {
		
		StudentDto 이몽룡 = new StudentDto();
		/*
		 *  이몽룡.stNum = "0001"
		 *  stNum 멤버 변수에 문자열 "0001을 setting( 대입 , 할당, 저장) 해 달라
		 */
		이몽룡.setStrNum("0001");
		/*
		 *  strNum = 이몽룡.stNum();
		 *  strNum 멤버 변수에 저장된 문자열을 읽어서 strNum 변수에 저장해  달라
		 */
//		String strNum =  이몽룡.getStNum();
		
		이몽룡.setStrNum("0001");
		이몽룡.setStrName("이몽룡");
		이몽룡.setStDept("컴퓨터공학");
		이몽룡.setStGrade(3);
		이몽룡.setStTel("010-1111-1111");
		
		System.out.println(이몽룡.toString());
		
		
		
	}
}
