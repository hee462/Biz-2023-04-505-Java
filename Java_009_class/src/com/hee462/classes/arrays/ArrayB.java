package com.hee462.classes.arrays;

import com.hee462.classes.model.ScoreDto;
import com.hee462.classes.service.ScoreServiceA;

public class ArrayB {
	
	
	public static void  main(String[] args) {
		
		// ScoreServiceA 클래스에 선언된 method 를 사용하기 위해 객체 변수 생선
		ScoreServiceA scoreService =  new ScoreServiceA();
		
		// 3명 학생의 성적정보를 저장할 객체 변수 생성
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		// 홍길동 학생의 학번, 이름, 과목 점수 셋팅
		홍길동.stNum = "0001";
		홍길동.stName = "홍길동";
		홍길동.scKor = scoreService .getScore();
		홍길동.scEng = scoreService .getScore(); 
		홍길동.scMath =scoreService . getScore();
		
		이몽룡.stNum = "0002";
		이몽룡.stName = "이몽룡";
		이몽룡.scKor = scoreService .getScore();
		이몽룡.scEng = scoreService .getScore(); 
		이몽룡.scMath = scoreService .getScore();
		
		성춘향.stNum = "0003";
		성춘향.stName = "성춘향";
		성춘향.scKor = scoreService .getScore();
		성춘향.scEng = scoreService. getScore(); 
		성춘향.scMath = scoreService .getScore();
		
		홍길동.getTotal();
		홍길동.getAvg();
		
		이몽룡.getTotal();
		이몽룡.getAvg();
		
		성춘향.getTotal();
		성춘향.getAvg();
		
		// 성적표 title 출력
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균 ");
		System.out.println("--------------------------------------------------");
		
		//각 학생의 성적 정보 출력
		scoreService.scorePrint(홍길동);
		scoreService.scorePrint(이몽룡);
		scoreService.scorePrint(성춘향);

		
		// 내가 작성했던 코드
//		System.out.print(홍길동.stNum +"\t");
//		System.out.print(홍길동.stName + "\t");
//		System.out.printf("%3d\t" , 홍길동.scKor);
//		System.out.printf("%3d\t" , 홍길동.scEng);
//		System.out.printf("%3d\t" , 홍길동.scMath);
//		System.out.printf("%3d\t" , 홍길동.getTotal());
//		System.out.printf("%5.2f\t" , 홍길동.getAvg());
//		System.out.println();
//		System.out.print(이몽룡.stNum +"\t");
//		System.out.print(이몽룡.stName + "\t");
//		System.out.printf("%3d\t" , 이몽룡.scKor);
//		System.out.printf("%3d\t" , 이몽룡.scEng);
//		System.out.printf("%3d\t" , 이몽룡.scMath);
//		System.out.printf("%3d\t" , 이몽룡.getTotal());
//		System.out.printf("%5.2f\t" , 이몽룡.getAvg());
//		System.out.println();
//		System.out.print(성춘향.stNum +"\t");
//		System.out.print(성춘향.stName + "\t");
//		System.out.printf("%3d\t" , 성춘향.scKor);
//		System.out.printf("%3d\t" , 성춘향.scEng);
//		System.out.printf("%3d\t" , 성춘향.scMath);
//		System.out.printf("%3d\t" , 성춘향.getTotal());
//		System.out.printf("%5.2f\t" , 성춘향.getAvg());
//		
//			 
			
	
	}
}
