package com.hee462.classes.exec;

import java.util.ArrayList;

import com.hee462.classes.models.ScoreDto;
import com.hee462.classes.service.ScoreServiceV2;

public class ExecD {
	public static void main(String[] args) {
		ScoreServiceV2 scService = new ScoreService();
		scService.makeScore();
		
		Lsit<ScoreDto> scList = new ArrayList<>();
		scService.makeScore();
	}
}
