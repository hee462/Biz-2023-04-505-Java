package com.hee462.classes.arrays;

import com.hee462.classes.model.ScoreDto;

public class ArrayA {
	
	public void  main(String[] args) {
		
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.stNum = "0001";
		홍길동.stName = "홍길동";
		
		이몽룡.stNum = "0002";
		이몽룡.stName = "이몽룡";
		
		성춘향.stNum = "0003";
		성춘향.stName = "성춘향";
		
		홍길동.scKor = 80;
		이몽룡.scKor = 80;
		성춘향.scKor = 80;
		
		홍길동.scEng = 80;
		이몽룡.scEng = 80;
		성춘향.scEng = 80;
		
		홍길동.scMath = 80;
		이몽룡.scMath= 80;
		성춘향.scMath= 80;
		
		홍길동.getTotal();
		홍길동.getAvg();
		
		이몽룡.getTotal();
		이몽룡.getAvg();
		
		성춘향.getTotal();
		성춘향.getAvg();
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균 ");
		System.out.println("--------------------------------------------------");
		System.out.print(홍길동.stNum +"\t");
		System.out.print(홍길동.stName + "\t");
		System.out.printf("%3d\t" , 홍길동.scKor);
		System.out.printf("%3d\t" , 홍길동.scEng);
		System.out.printf("%3d\t" , 홍길동.scMath);
		System.out.printf("%3d\t" , 홍길동.getTotal());
		System.out.printf("%5.2f\t" , 홍길동.getAvg());
		System.out.println();
		System.out.print(이몽룡.stNum +"\t");
		System.out.print(이몽룡.stName + "\t");
		System.out.printf("%3d\t" , 이몽룡.scKor);
		System.out.printf("%3d\t" , 이몽룡.scEng);
		System.out.printf("%3d\t" , 이몽룡.scMath);
		System.out.printf("%3d\t" , 이몽룡.getTotal());
		System.out.printf("%5.2f\t" , 이몽룡.getAvg());
		System.out.println();
		System.out.print(성춘향.stNum +"\t");
		System.out.print(성춘향.stName + "\t");
		System.out.printf("%3d\t" , 성춘향.scKor);
		System.out.printf("%3d\t" , 성춘향.scEng);
		System.out.printf("%3d\t" , 성춘향.scMath);
		System.out.printf("%3d\t" , 성춘향.getTotal());
		System.out.printf("%5.2f\t" , 성춘향.getAvg());
			
	
	}
}
