package com.hee462.student.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.student.models.StudentDto;
import com.hee462.student.utils.Line;

public class StudentExecA {
	public static void main(String[] args) {
		
		List<StudentDto> stdList = new ArrayList<>();
		 Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			
			StudentDto sDto =  new StudentDto();
			/*
			 * 어떤 데이터를 입력할것인가 라는 안내 메세지
			 * 각 속성(요소)를 입력할때 prompt 보이기
			 * 
			 * 
			 */
			System.out.println(Line.dLine(60));
			System.out.println("학생 정보를 입력하세요");
			System.out.println(Line.sLine(60));
			// 입력받은 값을 각 요소에 저장하기
			System.out.println("학번을 입력하세요");
			sDto.stNum = scan.nextLine();
			System.out.println("이름을 입력하세요");
			sDto. stName = scan.nextLine();
			System.out.println("과목을 입력하세요");
			sDto. stDept = scan.nextLine();
			System.out.println("학년을 입력하세요");
			sDto. stGrade = Integer.valueOf(scan.nextLine());
			System.out.println("전화번호을 입력하세요");
			sDto. stTel = scan.nextLine();
			
			// 입력받은값 출력해서 확인하기
			System.out.println(sDto);
			// Lsit에 입력받은 값 저장하기
			stdList.add(sDto);
			System.out.println(stdList.toString());
		}	
	
		
		
	}
}
