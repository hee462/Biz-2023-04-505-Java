package com.hee462.student.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.hee462.student.models.StudentDto;
import com.hee462.student.service.StudentService;
import com.hee462.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {

	List<StudentDto> stdList;
	protected Scanner scan;

	public StudentServiceImplV1() {
		stdList = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	/*
	 * insertStudent() 는 StudentService interface에 정의되지 않는 method
	 * 
	 * 이 method는 상속받는 것이 아니고 V1 클래스에서 임의로 생성한 method 이다
	 */
	public void insertStudent() {
		while (true) {

			System.out.println(Line.dLine(60));
			System.out.println("학생정보 추가 종료하려면 QUIT 입력");
			System.out.println(Line.sLine(60));

			String stNum;
			while (true) {
				System.out.print("학번 >> ");
				stNum = scan.nextLine();
				if (stNum.equals("QUIT"))break;

				try {
					// stNum을 정수형으로 형 변환
					int intNum = Integer.valueOf(stNum);
					// stNum을 String 형으로 변환후 0001 과같은 형태로 만듬
					stNum = String.format("%04d", intNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력하세요");
					continue;
				}
				break;
			}
			// 왜 한번더 할까? 
			// 전체를 감싸는 while문을 빠져나가기 위한 break; 만약 사용하지 않는다면
			// 빠져나가지 않고 이름을 물어봄
			if(stNum.equals("QUIT"))break;

			System.out.print("이름 >> ");
			String stName = scan.nextLine();
			if (stName.equals("QUIT"))break;

			System.out.print("학과 >> ");
			String stDept = scan.nextLine();
			if (stDept.equals("QUIT"))break;
			
			
			int intGrade =0;
			while (true) {
				System.out.print("학년 >> ");
				String strGrade = scan.nextLine();
				if (strGrade.equals("QUIT"))break;
				try {
					//String int로 형변환 
					intGrade = Integer.valueOf(strGrade);
				} catch (Exception e) {
				
					System.out.println("학년은 정수로 입력하세요");
					continue;
				}
				if (intGrade < 1 || intGrade > 4) {
					System.out.println("학년은 정수 1 ~ 4까지만 입력하세요");
					continue;
				}
				break;
			}
			

			System.out.print("전화번호 >> ");
			String stTel = scan.nextLine();
			if (stTel.equals("QUIT"));
			// 각 개체에 요소 담기
			StudentDto stDto = new StudentDto();
			stDto.stNum = stNum;
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = intGrade;
			stDto.stTel = stTel;
			stdList.add(stDto);

		} // end while
		System.out.println("학생정보 입력 종료!!");
	}

	@Override
	public void loadStudent() {


	}

	// TODO Auto-generated method stub

	@Override
	public void printStudent() {

		System.out.println(Line.dLine(100));
		System.out.println("대한 고교 학생 리스트");
		System.out.println(Line.dLine(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLine(100));
		// 입력받은 값이 없으면
		if (stdList == null || stdList.size() < 1) {
			System.out.println("표시할 데이터가 없음");
			return;
		}
		for (StudentDto dto : stdList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%s\t", dto.stGrade);
			System.out.printf("%s\n", dto.stTel);
		}
		System.out.println(Line.dLine(100));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudetnLsit() {
		// TODO Auto-generated method stub
		return null;
	}

}
