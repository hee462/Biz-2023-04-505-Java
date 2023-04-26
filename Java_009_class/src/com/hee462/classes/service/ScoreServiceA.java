package com.hee462.classes.service;

import com.hee462.classes.model.ScoreDto;

public class ScoreServiceA {
	// 51 ~ 100 까지 범위의 랜덤수를 만들어 return 
	public  int getScore() {
		int score = (int)(Math.random()*50)+51;
		return score;
	}
	
	// ScoreDto type 매개변수를 통하여 성적 정보 데이터를 받아서 출력하기
	public void scorePrint(ScoreDto score){
		
	
		System.out.print(score.stNum +"\t");
		System.out.print(score.stName + "\t");
		System.out.printf("%3d\t" , score.scKor);
		System.out.printf("%3d\t" , score.scEng);
		System.out.printf("%3d\t" , score.scMath);
		System.out.printf("%3d\t" , score.getTotal());
		System.out.printf("%5.2f\n" , score.getAvg());
	}
//	public void scoreTotalPrint(ScoreDto score){		
//		System.out.print(score.stNum +"\t");
//		System.out.print(score.stName + "\t");
//		System.out.printf("%3d\t" , Kor);
//		System.out.printf("%3d\t" , Eng);
//		System.out.printf("%3d\t" , Math);
//		System.out.printf("%3d\t" , kor+Eng+Math);
//		
//		
//
//	}
	
}
