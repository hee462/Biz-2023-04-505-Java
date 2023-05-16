package com.hee462.student.exec;

import java.util.Scanner;

import com.hee462.student.impl.StudentServiceImplV2;
import com.hee462.student.models.StudentDto;
import com.hee462.student.service.StudentService;
import com.hee462.student.utils.Line;

public class StudentExecG {
	public static void main(String[] args) {
		
		StudentDto stDto = new StudentDto();
		Scanner scan = new Scanner(System.in);
		StudentService stService = new StudentServiceImplV2();
		System.out.println(Line.dLine(100));
		System.out.println("대한 고교 학사 관리 2023");
		System.out.println(Line.sLine(100));
		
		while(true) {
			
			System.out.println("실행할 업무를 선택하세요");
			System.out.println("1. 학생 리스트 확인");
			System.out.println("2. 학생정보 추가/ 수정");
			System.out.println("3. 학생정보 삭제");
			System.out.println("9. 업무종료");
			System.out.print("업무 선택 >>");
			String strSelect = scan.nextLine();
			int intSelect = 0;
			try {
				// 입력받은 strSelect를 int형 변환후 intSelect 저장
				intSelect = Integer.valueOf(strSelect);
			} catch (Exception e) {
				System.out.printf("업무선택을 확인하세요(%s)", strSelect);
				continue;
			}
			if(intSelect == 1) {
				stService.printStudent();
			}else if(intSelect == 2) {
				stService.insertStudent();
			}else if(intSelect == 3) {
				/*
				 * deleteStudent() method는 Service interface에 없는 method 이다
				 * 따라서 method를 포함하고 있는 class type 으로 stService를 객체 형변환을 
				 * 해줘야만 사용할 수 있다.
				 */
				((StudentServiceImplV2)stService).deleteStudent();
					
			}else if(intSelect == 9) {
				break;
			}else {
				System.out.printf("업무 선택이 잘못 되었습니다(%d)\n",intSelect);
			}

		}
	}
}
