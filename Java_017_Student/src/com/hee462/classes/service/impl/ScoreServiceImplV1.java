package com.hee462.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.config.Line;
import com.hee462.classes.datas.DataIndex;
import com.hee462.classes.datas.DataSource;
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
public class ScoreServiceImplV1 implements ScoreService {
	// 가급적 사용하지 말기
	// private List<ScoreDto>scList= new ArrayList<>();
	protected List<ScoreDto> scList;

	// scList 초기화 하여 생성
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}

	// 성적정보 문자열 1개를 컴마(,)로 분해하고
	// ScoreDto 객체로 변환하여 return 하는 method
	protected ScoreDto str2Dto(String str) {
		String[] score = str.split(",");

		// ScoreDto 클래스는 field 생성자가 있다
		// field 생성자를 통하여 데이터가 포함된 scDto 객체를 생성
		ScoreDto scDto = new ScoreDto(score[DataIndex.SCORE.ST_NUM],
				Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
				Integer.valueOf(score[DataIndex.SCORE.SC_ENG]),
				Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
				Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]), 
				Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
				Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
				Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])

		);
		return scDto;
	}

	@Override
	public void loadScore() {
		// DataSource.SCORE 문자열 배열의 값을 List<ScorDto> type의 리스트 데이터로 변환하기
		for (String str : DataSource.SCORE) {
//			 String[] score = str.split(",");
//			 
//			 // ScoreDto 클래스는 field 생성자가 있다
//			 // field 생성자를 통하여 데이터가 포함된 scDto 객체를 생성
//			 ScoreDto scDto = new ScoreDto(
//					 score[DataIndex.SCORE.ST_NUM],
//					 Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_ENG]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
//					 Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
//				
//					 );
			ScoreDto scDto = str2Dto(str);
			scList.add(scDto);

		}

		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		StudentServiceImplV1 stService = new StudentServiceImplV1();
		// 이름, 학과 정보가 담긴 method 호출
		stService.loadStudent();

		StudentDto studentDto = new StudentDto();

		System.out.println(Line.dLINE(100));
		System.out.println("학번\t 이름\t 학과\t\t 국어\t 수학\t영어\t 음악\t 미술\t컴공\t데이터");
		System.out.println(Line.sLINE(100));
		for (ScoreDto dto : scList) {
			// 학번을 StudentServiceImplV1.getStudent() method 에게 전달하고.
			// 학번에 해당하는 학생 데이터를 return 바아서
			// StudentDto type 의 객체에 저장하기
			studentDto = stService.getStudent(dto.getStNum());

			System.out.print(dto.getStNum() + "\t");
			if (studentDto != null) {

				System.out.print(studentDto.stName + "\t");
				System.out.print(studentDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t");
			}
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			System.out.print(dto.getScSofeware() + "\t");
			System.out.println(dto.getScDatabase() + "\t");

		}
		System.out.println(Line.dLINE(100));
		// TODO Auto-generated method stub

	}

}
