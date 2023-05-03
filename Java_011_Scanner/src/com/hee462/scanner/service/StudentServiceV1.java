package com.hee462.scanner.service;

import java.util.Scanner;

import com.hee462.scanner.model.StudentDto;

public class StudentServiceV1 {

	public void inputStudent() {
		// StudenDto 가져오면서 student 객체 선언
		StudentDto student = new StudentDto();
		// 키보드 입력기능 생성
		Scanner scan = new Scanner(System.in);

		System.out.println("학생정보를 입력하세요");
		System.out.println("학번을 입력하세요 >>");
		String strNum = scan.nextLine();

		System.out.println("이름을 입력하세요 >>");
		String strName = scan.nextLine();

		System.out.println("학과을 입력하세요 >>");
		String stDept = scan.nextLine();
		
		int intGrade = 0;

		while (true) {
			System.out.println("학년을 입력하세요 >>");
			String stGrade = scan.nextLine();

			try {
				intGrade = Integer.valueOf(stGrade);
			} catch (Exception e) {
				System.out.println("학년은 정수로만 입력하세요");
				continue;
			}

			if (intGrade < 1 || intGrade > 4) {
				System.out.println("학년은 1 ~ 4 범위에서 입력하세요");
				continue;
			}
			break;
		}

		System.out.println("전화번호를 입력하세요 >>");
		String stTel = scan.nextLine();

		student.setStrNum(strNum);
		student.setStrName(strName);
		student.setStDept(stDept);
		student.setStGrade(intGrade);
		student.setStTel(stTel);

		System.out.println(student.toString());

	}

}
