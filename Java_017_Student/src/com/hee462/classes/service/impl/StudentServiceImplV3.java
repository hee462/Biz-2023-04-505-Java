package com.hee462.classes.service.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.classes.config.Line;
import com.hee462.classes.datas.DataIndex;
import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.StudentService;

/*
 * StudentServiceImplV1 은 StudentService interface를 implements 하였고
 * StudentServiceImplV3 sms StudentServiceImplV1 을 extends 하였다.
 */
public class StudentServiceImplV3 implements StudentService {
	protected List<StudentDto> stdList;

	public StudentServiceImplV3() {
		stdList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadStudent() {

		String studentFile = "src/com/hee462/classes/datas/Student.csv";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(studentFile);

		} catch (Exception e) {
			System.out.println(studentFile + " 이 없습니다. 확인하세요");
			// TODO: handle exception
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			// 한줄씩 파일에서 읽어 line 에 저장
			// String[] student = scan.nextLine().split(","); 요렇게 한줄로 사용해도 됨
			String line = scan.nextLine();
			
			String[] student = line.split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[DataIndex.SUTDENT.ST_NUM];
			stDto.stName = student[DataIndex.SUTDENT.ST_NAME];
			stDto.stDept = student[DataIndex.SUTDENT.ST_DEPT];
			stDto.stGrade = Integer.parseInt(student[DataIndex.SUTDENT.ST_GRADE]);
			stDto.stTel = student[DataIndex.SUTDENT.ST_TEL];
			stDto.stAddress = student[DataIndex.SUTDENT.ST_ADDRESS];
			stdList.add(stDto);

		} // end while 문
		scan.close();

	}

	@Override
	public void printStudent() {

		System.out.println(Line.dLINE(100));
		System.out.println("학번\t 이름\t 학과\t\t 학년\t 전화번호\t 주소");
		System.out.println(Line.sLINE(100));
		int rows = 0;
		for (int i = 0; i < stdList.size(); i++) {

			System.out.print(stdList.get(i).stNum + "\t");
			System.out.print(stdList.get(i).stName + "\t");
			System.out.print(stdList.get(i).stDept + "\t");
			System.out.print(stdList.get(i).stGrade + "\t");
			System.out.print(stdList.get(i).stTel + "\t");
			System.out.println(stdList.get(i).stAddress + "\t");
			// 5 줄 마다 구분선을 출력
			// 다만 구분선 출력 위치가 리스트의 끝보다 작을때만
			if (++rows % 5 == 0 && rows < stdList.size()) {
				System.out.println(Line.sLINE(100));
			}

		}
		System.out.println(Line.dLINE(100));

		// TODO Auto-generated method stub

	}

	@Override
	public StudentDto getStudent(String stNum) {
		for (StudentDto dto : stdList) {
			if (dto.stNum.equals(stNum))
				return dto;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
