package com.hee462.classes.module;

public class ServiceF {
	public void score(int num1,int num2, int num3, int num4, int num5, int num6, int num7) {
		int total =  num1+num2+num3+num4+num5+num6+num7;
		int avg = total/7;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
