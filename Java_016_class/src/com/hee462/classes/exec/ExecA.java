package com.hee462.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.hee462.classes.service.ScoreServiceV1;

public class ExecA {
	public static void main(String[] args) {
		// ScoreServiceV1 클래스에 정의된 method를 사용하기위하여
		// 클래스를 객체로 생성하는 절차
		
		// method 사용하기  = method 를 호출하기
		// 정의된(작성된) method 에게 어떤 일을 (업무, 행위,메세지) 시키기
		ScoreServiceV1 scService = new ScoreServiceV1();
		scService.makeScore(); // 점 연산자를 통해서 method 호출  
		scService.printScore();
		
		// Integer List type 의  scoreList 객체 변수 생성
		List<Integer> scoreList = new ArrayList<>();
		
		// makeScore() method 호출, 사용
		// scoreList 라는 데이터가 담긴 객체변수의 " 기억장차지 주소"를 
		// makeScore() method 에게 전달하면서 뭔가 요청하기	
		scService.makeScore();
		
		// makeScore() method를 호출하기
		// method 를 호출하면서 scoreList라는 데이터가 담긴
		// 객체변수의 " 기억장치 주소" 를 전달하고
		// return 된 결과를 result 변수에 저장해 달라는 요청
		int result = scService.makesScore(scoreList);
		
		
	}
}
