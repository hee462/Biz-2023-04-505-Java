package com.hee462.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.models.ScData;
import com.hee462.classes.models.ScoreDto;
import com.hee462.classes.models.StudentDto;
import com.hee462.classes.service.ScoreService;
/*
 * interface(class)를 implements 한 클래스는
 * interface에 선언된 모든 method를 의무적으로 구현해야 한다.
 * interface에 선언된 method 를 한개로 생략하면,
 *             클래스 코드는 문법 오류가 발생하고 실행 불가 상태가 된다.
 * 
 */
public class ScoreServiceImplV3 implements ScoreService{
	
	private List<ScoreDto>scList;
	public ScoreServiceImplV3() {
		scList = new ArrayList<>();
	}
	
	
	
	@Override
	public void makeScore() {
		 for(String str : ScData.SCORE) {
			 String[] score = str.split(",");
			 ScoreDto scDto = new ScoreDto(
					 score[ScData.ST_NUM],
					 Integer.valueOf(score[ScData.SC_KOR]),
					 Integer.valueOf(score[ScData.SC_ENG]),
					 Integer.valueOf(score[ScData.SC_MATH]),
					 Integer.valueOf(score[ScData.SC_MUSIC]),
					 Integer.valueOf(score[ScData.SC_ART]),
					 Integer.valueOf(score[ScData.SC_SOFTWARE]),
					 Integer.valueOf(score[ScData.SC_DATABASE])
				
					 );
			        scList.add(scDto);
			 		 
		 }
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		StudentServiceImplV1 stService = new StudentServiceImplV1 ();
		stService.loadStudent();
		
		StudentDto studentDto = new StudentDto();

		for(ScoreDto dto :  scList) {
			studentDto = stService.getStudent(dto.getStNum());
			
			System.out.print(dto.getStNum()+ "\t");
			System.out.print(studentDto.stName + "\t");
			System.out.print(studentDto.stDept +"\t");
			System.out.print(dto.getScKor()+ "\t");
			System.out.print(dto.getScEng()+ "\t");
			System.out.print(dto.getScMath()+ "\t");
			System.out.print(dto.getScMusic()+ "\t");
			System.out.print(dto.getScArt()+ "\t");
			System.out.print(dto.getScSofeware()+ "\t");
			System.out.println(dto.getScDatabase()+ "\t");
			
		}
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}
	
}
