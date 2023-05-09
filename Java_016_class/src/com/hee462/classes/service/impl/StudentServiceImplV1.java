package com.hee462.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.models.StdData;
import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	// 클래스 영역에 필드 변수로 StudentDto List type
	
	private List<StudentDto> stdList;
	
	
	public StudentServiceImplV1() {
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {
		// student 문자열 배열 데이터를 forEach(확장for)를 
		// 분해하여 개별 문자열을 str 에 담고 for() {} 에 전달하기
		for(String str : StdData.STUDENT) {
			//str 문자열 변수에 저장된 문자열을 "," 기준으로 다시 분해하여 student 배열에 저장
			String[] student = str.split(",");
			//StudentDto type 의 객체를 생성함
			StudentDto studentDto = new StudentDto();
			// student 배열에 각 요소를 StudentDto type 객체 요소(변수)에 저장하기
			studentDto.stNum = student[StdData.ST_NUM];
			studentDto.stName = student[StdData.ST_NAME];
			studentDto.stDept = student[StdData.ST_DEPT];
			studentDto.stGrade = Integer.parseInt(student[StdData.ST_GRADE]);
			studentDto.stTel = student[StdData.ST_TEL];
			studentDto.stAddress = student[StdData.ST_ADDRESS];
			// List<StudentDto> type 의 리스트 추가하기
			stdList.add(studentDto);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		System.out.println("=".repeat(100));
		System.out.println("학번\t 이름\t 학과\t\t 학년\t 전화번호\t 주소");
		System.out.println("-".repeat(100));
		for(int i = 0 ; i <stdList.size() ; i++) {
			System.out.print(stdList.get(i).stNum +"\t") ;
			System.out.print(stdList.get(i).stName+ "\t");
			System.out.print(stdList.get(i).stDept + "\t");
			System.out.print(stdList.get(i).stGrade+ "\t");
			System.out.print(stdList.get(i).stTel+"\t");
			System.out.println(stdList.get(i).stAddress+"\t");
		
		}
		System.out.println("=".repeat(100));
		
		// TODO Auto-generated method stub
		
	}
	/*
	 * stdList에서 stNum 학번의 학생 데이터를 찾아서
	 *  학생데이터를 return
	 */
	@Override
	public StudentDto getStudent(String stNum) {
		for(StudentDto dto : stdList ) {
			if(dto.stNum.equals(stNum))
				return dto;
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}

	

}
