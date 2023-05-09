package com.hee462.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.models.StudentDto;

public class ExecC {
	public static void main(String[] args) {
		// StudentDto type List  객체변수 stdLsit 생성하기
		// size() 0 인 변수
		List<StudentDto> stdList = new ArrayList<>();
		
		// 홍길동의 학생정보를 저장힉 위한 stDto 를 생성하고
		StudentDto stDto = new StudentDto();
		
		// 학번,이름, 학과 변수에 값을 저장하고
		stDto.stNum = "0001";
		stDto.stName = " 홍길동";
		stDto.stDep = "정보통신";
		
		// 홍길동 객체를 stdList에 추가하기
		stdList.add(stDto);
		
		stDto = new StudentDto();
		stDto.stNum = " 0002";
		stDto.stName = "성춘향";
		stDto.stDep = " 컴퓨터공학";
		stdList.add(stDto);
		
		System.out.println(stdList.get(0).stName);
		
		// stdList 의 index 0 데이터(학생객체 데이터)를 
		// get(읽기) 하여 홍길동 객체변수에 복사하기
		StudentDto 홍길동 = stdList.get(0);
		System.out.println(홍길동.toString());
		System.out.println(홍길동.stName);
		System.out.println(stdList.get(0).stName);
		
		StudentDto 성춘향 = stdList.get(1);
		System.out.println(성춘향.toString());
		System.out.println(성춘향.stName);
		/*
		 * stList 에서 .get(1) 를 실행하는 순간
		 * stList 에 저장된 데이터 중에서 index1의 데이터가
		 * 객체로 변환된다
		 * stList.get(1) 은 stdList 의 index 1의 객체데이터 이다.
		 * 
		 * 
		 */
		System.out.println(stdList.get(1).stName);
		
		for( int i = 0 ; i < stdList.size() ; i++) {
			String stName = stdList.get(i).stName;  // stdList 에서 stName 요소만 불러오기
			System.out.println(stName);
		}
		
	}
}
