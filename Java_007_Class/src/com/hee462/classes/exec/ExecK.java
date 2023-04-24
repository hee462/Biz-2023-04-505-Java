package com.hee462.classes.exec;

import com.hee462.classes.module.ServiceB;

public class ExecK {
	public static void main(String[] args) {
	
		String name = "홍길동";
		int rndKor = (int)(Math.random()*50)+51;
		int rndEng = (int)(Math.random()*50)+51;
		int rndMath = (int)(Math.random()*50)+51;
		
		ServiceB serviceB = new ServiceB();
		
		serviceB.scorePrint(name, rndKor,rndEng,rndMath);
		
		
		
}
	
}