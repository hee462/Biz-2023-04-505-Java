package com.hee462.score;

public class Project01 {
	public static void main(String[] args) {	
		
		ScoreDto[] scores = new ScoreDto[10];
		
		for(int i = 0 ; i < scores.length ; i ++) {
			scores[i] = new ScoreDto();
		}
		
		ScoreService scService = new ScoreService();
		
		 
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i].stNum = String.format("23%03d", i+1);
			scores[i].intKor =scService.getscore();
			scores[i].intEng =scService.getscore();
			scores[i].intMath =scService.getscore();
			scores[i].intMusic =scService.getscore();
			scores[i].intArt =scService.getscore();
			
			
		}
		System.out.println("=".repeat(70));
		System.out.println("* 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(70));
		for(int i = 0 ; i < scores.length ; i++) {
			scService.scorePrint(scores[i]);
		
		}
		
			scService.totalSum(scores);
	
		
		
		
	}
}