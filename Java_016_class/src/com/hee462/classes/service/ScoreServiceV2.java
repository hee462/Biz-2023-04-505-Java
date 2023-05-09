package com.hee462.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.models.ScoreDto;

public class ScoreServiceV2 {

public void makeScore(List<ScoreDto> scoreList) {
	this.makeScore(scoreList);
	
//	for (int i = 0; i < 10; i++) {
//		// 0001 ~ 0010 까지 학번 만들기
//		String stNum = String.format("%04d", i+1);
//		// 점수 생성
//		int intKor = ((int)(Math.random()*50)+51);
//		int intEng = ((int)(Math.random()*50)+51);
//		int intMath = ((int)(Math.random()*50)+51);
//		// 학번과 점수를 각 개체에 저장
//		ScoreDto scDto = new ScoreDto();
//		scDto.setStNum(stNum);
//		scDto.setScKor(intKor);
//		scDto.setScEng(intEng);
//		scDto.setScMath(intMath);
//		// 점수 리스트에 저장
//		scoreList.add(scDto);
		
}

	
}
	// scoreList 변수를 ScoreServiceV2 클래스의
	// 다른 method 에서 사용하기 위하여
	// 클래스 영역으로 scope를 이동한다.
	// 클래스 영역으로 scope 가 이동된 객체변수는
	// 선언만 수행한다.
	// 선언만 수행된 객체변수는 사용하려고 하면 NullPointExec
    private List<ScoreDto> scoreList;
	public void makeScore() {
		// scoreList 변수의  scope 가 makeScore() {} 블럭이다
		// 만약 다른 method(예 , sprintScore()) 에서
		// scoreList 변수값을 사용하려면
		// 
	
		
		for (int i = 0; i < 10; i++) {
			// 0001 ~ 0010 까지 학번 만들기
			String stNum = String.format("%04d", i+1);
			// 점수 생성
			int intKor = ((int)(Math.random()*50)+51);
			int intEng = ((int)(Math.random()*50)+51);
			int intMath = ((int)(Math.random()*50)+51);
			// 학번과 점수를 각 개체에 저장
			ScoreDto scDto = new ScoreDto();
			scDto.setStNum(stNum);
			scDto.setScKor(intKor);
			scDto.setScEng(intEng);
			scDto.setScMath(intMath);
			// 점수 리스트에 저장
			scoreList.add(scDto);

		}
		

	
	}

}
