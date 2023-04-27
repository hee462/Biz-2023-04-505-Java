package com.hee462.score;

public class ScoreDto {

	public String stNum;
	
	public int intKor;
	public int intEng;
	public int intMath;
	public int intMusic;
	public int intArt;
	

	public int getTotal() {
		int total = this.intKor;
		total += this.intEng;
		total += this.intMath;
		total += this.intMusic;
		total += this.intArt;
		return total;
	}

	public float getAvg() {
		float avg = (float) this.getTotal() / 5;
		return avg;
	}
	

	

}
