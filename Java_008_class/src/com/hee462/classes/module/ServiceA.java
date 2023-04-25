package com.hee462.classes.module;

public class ServiceA {

	public void score(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		int total = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		float avg = (float)total / 7;
		
		
		System.out.println("국어 : "+ num1);
		System.out.println("영어 : "+ num2);
		System.out.println("수학 : "+ num3);
		System.out.println("국사 : "+ num4);
		System.out.println("음악 : "+ num5);
		System.out.println("미술 : "+ num6);
		System.out.println("체육 : "+ num7);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}
}