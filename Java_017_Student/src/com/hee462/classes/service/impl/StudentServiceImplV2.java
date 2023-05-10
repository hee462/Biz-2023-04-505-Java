package com.hee462.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.classes.config.Line;
import com.hee462.classes.datas.DataIndex;
import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.StudentService;

public class StudentServiceImplV2 implements StudentService {
	private List<StudentDto> stdList;

	public StudentServiceImplV2() {
		stdList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadStudent() {
		String studentFile = "src/com/hee462/classes/datas/Student.csv ";

		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			String list = fileScan.nextLine();
			String[] spList = list.split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = spList[DataIndex.SUTDENT.ST_NUM];
			stDto.stName = spList[DataIndex.SUTDENT.ST_NAME];
			stDto.stDept = spList[DataIndex.SUTDENT.ST_DEPT];
			stDto.stGrade = Integer.parseInt(spList[DataIndex.SUTDENT.ST_GRADE]);
			stDto.stTel = spList[DataIndex.SUTDENT.ST_TEL];
			stDto.stAddress = spList[DataIndex.SUTDENT.ST_ADDRESS];
			stdList.add(stDto);
		}
		fileScan.close();

	}

	@Override
	public void printStudent() {
		
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t 이름\t 학과\t\t 학년\t 전화번호\t 주소");
		System.out.println(Line.sLINE(100));
		for(int i = 0 ; i <stdList.size() ; i++) {
			
			System.out.print(stdList.get(i).stNum +"\t") ;
			System.out.print(stdList.get(i).stName+ "\t");
			System.out.print(stdList.get(i).stDept + "\t");
			System.out.print(stdList.get(i).stGrade+ "\t");
			System.out.print(stdList.get(i).stTel+"\t");
			System.out.println(stdList.get(i).stAddress+"\t");
		
		}
		System.out.println(Line.dLINE(100));
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

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
