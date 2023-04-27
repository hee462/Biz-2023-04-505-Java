package com.hee462.score;

public class ScoreService {
	public int getscore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	public void scorePrint(ScoreDto score) {

		System.out.print(score.stNum);
		System.out.print("\t");
		System.out.printf("%3d\t", score.intKor);
		System.out.printf("%3d\t", score.intEng);
		System.out.printf("%3d\t", score.intMath);
		System.out.printf("%3d\t", score.intMusic);
		System.out.printf("%3d\t", score.intArt);
		System.out.printf("%3d\t", score.getTotal());
		System.out.printf("%5.2f\n", score.getAvg());

	}

	public static void totalSum(ScoreDto[] score) {

		int sumTotal = 0;
		int sumAvg = 0;
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;

		for (int i = 0; i < score.length; i++) {
			sumKor += score[i].intKor;
			sumEng += score[i].intEng;
			sumMath += score[i].intMath;
			sumMusic += score[i].intMusic;
			sumArt += score[i].intArt;
			sumTotal = (sumKor+ sumEng + sumMath +sumMusic +sumArt);
			
		}
		float avgKor = sumKor / 10;
		float avgEng = sumKor / 10;
		float avgMath = sumKor / 10;
		float avgMusic = sumKor / 10;
		float avgArt = sumKor / 10;
		float totalAvg = (avgKor +avgEng +avgMath+avgMusic+avgArt);

		System.out.println("-".repeat(70));
		System.out.print("총점");
		System.out.print("\t");
		System.out.printf("%3d\t", sumKor);
		System.out.printf("%3d\t", sumEng);
		System.out.printf("%3d\t", sumMath);
		System.out.printf("%3d\t", sumMusic);
		System.out.printf("%3d\t", sumArt);
		System.out.printf("%3d\n", sumTotal);

		System.out.print("평균");
		System.out.print("\t");
		System.out.printf("%5.2f\t", avgKor);
		System.out.printf("%5.2f\t", avgEng);
		System.out.printf("%5.2f\t", avgMath);
		System.out.printf("%5.2f\t", avgMusic);
		System.out.printf("%5.2f\t", avgArt);
		System.out.print("\t");
		System.out.printf("%5.2f\n", totalAvg);
		System.out.println("=".repeat(70));
	}

}
