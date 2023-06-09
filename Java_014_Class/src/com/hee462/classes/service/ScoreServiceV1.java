
package com.hee462.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.models.ScoreDto;

public class ScoreServiceV1 {
	// 학생수를 10 으로 설정항기 위한 변수 선언
	private int classSize = 10;

// List type을 매개변수로 받음
	/*
	 * 배개변수로 일반 변수가 아닌 참조형 갹체 변수를 사용했다 참조형 객체변수는 실제 저장된 값이 전달 되는 것이 아니고, 기억장소에 주소가
	 * 전달된다.
	 * 
	 * main() method 에서 보낼때 scoreList 의 주소가 전달되고 makeScore() 에서 값을 변경 시키면 main()
	 * method 의 scoreList가 같이
	 * 
	 */
	public void makeScore(List<ScoreDto> scoreList) {
		for (int i = 0; i < classSize; i++) {
			// 001, 002 학번 형식으로 학번 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			// 랜덤값으로 점수 만들기
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * 배열에서는 먼저 배열선언 , 배열 초기화, 각 요소에 데이터 저장 순서로 진행 함 List type 의 데이터 
			 * 1. 먼저비어있는(blank) List type 을 생성 
			 * 2. Dto 객체변수를 생성하고 
			 * 3. Dto 각 변수에 값을 setting (setter)
			 * 4. List에 Dto를 add
			 * 
			 */
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusin(scMusic);
			scoreDto.setScArt(scArt);
			scoreList.add(scoreDto);

		}

	} /// makeScore() method end
	/*
	 * ======================================= 
	 * 학번     국어   수학   음악   미술
	 * 
	 * 
	 */

	public void printScore(List<ScoreDto> scList) {

		System.out.println("=".repeat(60));
		System.out.println("학번 \t 국어\t수학\t음악\t미술");
		System.out.println("-".repeat(60));
		for (int i = 0; i < scList.size(); i++) {
			System.out.print(scList.get(i).getStNum() + " \t");
			System.out.print(scList.get(i).getScKor() + " \t");
			System.out.print(scList.get(i).getScMath() + " \t");
			System.out.print(scList.get(i).getScMusin() + " \t");
			System.out.print(scList.get(i).getScArt() + " \t");
			System.out.println(scList.get(i).getTotal() + " \t");

		}
		System.out.println("=".repeat(60));

	}

	// scList 데이터를 총점을 기준으로 오름차순 정령하기
	// scList 의 객체 데이터에서 getTotal() 값을 기준으로 비교하고
	// scList 의 객체 요소를 교환하기
	public void sortScore(List<ScoreDto> scList) {
	
		for( int i = 0 ; i < scList.size() ; i++) {
			for(int j = i+1 ;i < scList.size() ; j++) {
				if( scList.get(i).getTotal() > scList.get(j).getTotal()) {
					
					ScoreDto num = scList.get(i);
					// i 번째 요소와 j 번재 요소를 서로 바꾸는 코드 
					scList.set(i, scList.get(j));
					scList.set(j, num);
				
				}
			}
		}

	}

	public void add(int num1, int num2) {

		num1 = 1000;
		num2 = 2000;

	}

}
