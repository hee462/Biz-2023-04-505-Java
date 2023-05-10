package com.hee462.classes.service.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.hee462.classes.config.Line;
import com.hee462.classes.models.ScoreDto;
import com.hee462.classes.models.StudentDto;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	public ScoreServiceImplV2() {
		// V1 에서 protected 로 선언 scList 를 사용할 수 있도록 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
	}

	public void loadStudent() {
		InputStream is = null;
		Scanner scan = null;
		String scoreFile = "src/com/hee462/classes/datas/Score.csv";

		try {
			is = new FileInputStream(scoreFile);

		} catch (Exception e) {
			// TODO: handle exception
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			ScoreDto dto = str2Dto(line);
			scList.add(dto);
		}

	}

	@Override
	public void printScore() {
		StudentServiceImplV2 stService = new StudentServiceImplV2();

		stService.loadStudent();

		StudentDto studentDto = new StudentDto();

		System.out.println(Line.dLINE(100));
		System.out.println("학번\t 이름\t 학과\t\t 국어\t 수학\t영어\t 음악\t 미술\t컴공\t데이터");
		System.out.println(Line.sLINE(100));
		for (ScoreDto dto : scList) {

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

	}
}
