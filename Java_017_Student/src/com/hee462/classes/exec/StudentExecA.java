package com.hee462.classes.exec;

import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.StudentService;
import com.hee462.classes.service.impl.StudentServiceImplV1;

public class StudentExecA {
	public static void main(String[] args) {
		// interface 로 객체선언, class의 생성자로 객체 생성(초기화)
		 StudentService stService = new StudentServiceImplV1();
//StudentServiceImplV1 stService = new StudentServiceImplV1(); 처럼 쓸수 있지만 interface가 상속되어있기때문에 위 패턴으로 사용한다.
		
		stService.loadStudent();
		stService.printStudent();
		
		StudentDto stDto = stService.getStudent("S0001");
		// null 체크하는 코드 :  null safe coding
		// method를 호출하여 return 값을 결과로 하여 다른 객체 변수에
		// 저장을하고, 객체의 속성, method 들을 통하여 다른 일을 수행 하려고할때,
		// 객체 자체가 null 일 경우 "NullPointerException" 이 발생한다.
		// 이런한 상황을 미리 예측하고, 대비하는 코드
		
		// **** if문 사용법
		if(stDto != null) {
			
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());
		} else{
			System.out.println("찾는 데이터가 없음");
		}
		// **** try- catch 문 사용
		try {
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());
		} catch (Exception e) {
			System.out.println("찾는 데이터가 없음");
			// TODO: handle exception
		}
		
		
	
}
}