package com.hee462.scanner.service;

import java.util.Scanner;

import com.hee462.scanner.model.StudentDto;

public class StudentServiceV22 {

	public void inputStudents() {
		// 학생 리스트를 담을 배열 선언
		private StudentDto []  stList;

		Scanner scan = new Scanner(System.in);
		
		// 요소가 5개인 배열을 선언
		// 
		stList =new StudentDto[5];
		// 학생 수 만큼 반복
		for (int i = 0; i < stList.length; i++) {
			stList[i] = new StudentDto();

			System.out.println("학생정보를 입력하세요");
			
			while(true) {
				System.out.println("학번( 1 ~ 5) 을 입력하세요 >>");
			String strNum = scan.nextLine();
			int intNum = 0;
			try {
				intNum =Integer.valueOf(strNum)
			}catch (Exception) {
				System.out.println("학번은 정수로 입력하세요");
			}
			
			System.out.println("이름을 입력하세요 >>");
			String strName = scan.nextLine();
			
			System.out.println("학과을 입력하세요 >>");
			String stDept = scan.nextLine();
			}

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

			stList[i].setStrNum(strNum);
			stList[i].setStrName(strName);
			stList[i].setStDept(stDept);
			stList[i].setStGrade(intGrade);
			stList[i].setStTel(stTel);


		
		}
	}
}
