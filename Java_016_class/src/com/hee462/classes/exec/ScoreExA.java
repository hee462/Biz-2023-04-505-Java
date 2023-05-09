package com.hee462.classes.exec;

import com.hee462.classes.service.impl.ScoreServiceImplV3;

public class ScoreExA {
	public static void main(String[] args) {
		ScoreServiceImplV3 scService =  new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
		
		
	}
}
