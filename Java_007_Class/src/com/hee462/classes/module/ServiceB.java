package com.hee462.classes.module;



public class ServiceB {
	public ServiceB() {
		
	}
	public void scorePrint(String name, int intKor, int intEng, int intMath) {
		int total = intKor + intEng + intMath;
		float avg = (float) total / 3;
	System.out.println("============================");
	System.out.println("이름   국어    영어   수학   총점  평균");
	System.out.println("----------------------------------------");	
	System.out.println(name +" "+ intKor+" "+ intEng+" "+ intMath+" " + total+" " + avg+" ");
	System.out.println("============================");
	
	
	
	
	}
	

}
