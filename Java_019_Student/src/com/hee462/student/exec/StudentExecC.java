package com.hee462.student.exec;

import com.hee462.student.impl.StudentServiceImplV1;
import com.hee462.student.service.StudentService;
/*
 * StudentServiceImplV1 클래스를 작성하는 개발자가 테스트를 위해 작성하는 코드
 * 
 * ImplV1 클래스에는 insertStudent() 라는 method를 작성했다
 * 하지만, StudentService interface 에는 insertStudent() 가 없다.
 * 
 * 1. Service interface 에 insertStudent() method 를 추가 요청
 * 	   이 상호아이 발생하면 사전에 팀원들간의 업무 조율이 명확하게 이루어지고
 * 	   모든 팀원이 공감한다면 상관 없다. 하지만 실제 상황에서는 이러한 문제가 발생하면
 *     프로젝트 전체에 영향을 미치게 된다.
 *     
 *     또한 계속해서 이 프로젝트에서 insertStudent() method 를 계속 사용할 예정이라면 이 방법이 최선이다
 *     하지만, 어떤 특정 개발자의 필요에 의해서 InsertStudent() method가 작성되었다면, 절대 해서는 안된다
 *     
 * 2. 객체의 형변환을 통하여 생성된 객체를 자신의 ImplV1 클래스로 형변환하여
 * 임시로 method를 사용하는 방법    
 * 		
 * 
 */
public class StudentExecC {
	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV1();
		/*
		 * stService는 StudentService(interface) type 의 객체이다.
		 * 그리고 insertStudent() method 는 StudentServiceImplv1 클래스에 정의된 method이다
		 * 이러한 상황에서 insertStudent() method 를 테스트 하기 위하여 
		 * stService 객체를 형변환 하여 수행한다.
		 */

		((StudentServiceImplV1)stService).insertStudent();
		System.out.println("학생정보 입력 종료!!");
		
		stService.printStudent();
		
	}
}
