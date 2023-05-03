package com.hee462.system.exec;

import java.awt.geom.FlatteningPathIterator;

public class NumbersB {
	public static void main(String[] args) {
		String str1 = "30"; // 문자열 형 정수
		String str2 = "30.0"; // 문자열형 실수
		
		int num1 = Integer.valueOf(str1);
		float num2 = Float.valueOf(str2);
		
		System.out.printf(" %d + %f\n " , num1 ,num2);
		num2 = Float.valueOf(str1);
		num1 = (int)(num2);
		
	}
}
