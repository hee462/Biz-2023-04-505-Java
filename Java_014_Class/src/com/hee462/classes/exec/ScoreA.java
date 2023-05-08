package com.hee462.classes.exec;

import com.hee462.classes.models.ScoreDto;

public class ScoreA {
	public static void main(String[] args) {

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.setStNum("0001");
		scoreDto.setScKor(80);
		scoreDto.setScMath(80);
		scoreDto.setScMusin(92);
		scoreDto.setScArt(77);

		System.out.println(scoreDto.toString());

	}
}
