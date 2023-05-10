package com.hee462.classes.exec;

import com.hee462.classes.service.impl.ScoreServiceImplV2;

public class StudentExecG {
	public static void main(String[] args) {
		ScoreServiceImplV2 scService = new ScoreServiceImplV2();
		scService.loadStudent();
		scService.printScore();
		
	}
}
