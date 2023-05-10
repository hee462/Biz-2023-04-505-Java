package com.hee462.classes.exec;

import com.hee462.classes.service.ScoreService;
import com.hee462.classes.service.impl.ScoreServiceImplV1;

public class ScoreExecA {
	public static void main(String[] args) {
		ScoreService scService =  new ScoreServiceImplV1();
		
		scService.loadScore();
		scService.printScore();
	}
	
	
}
