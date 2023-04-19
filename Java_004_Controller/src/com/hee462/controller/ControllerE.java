package com.hee462.controller;

public class ControllerE {
	public static void main(String[] args) {

		int nCount = 0;
		int nSum = 0;
		for (int i = 0; i < 100; i++) {
			int Num = (int) (Math.random() * 50) + 51;
			if (Num % 2 == 0) {
				nCount++;
				// 누적 :  숫자값을 계속 쌓아서 덧셈
				nSum += Num;
			}

		}
		int Avg = nSum / nCount;
		System.out.printf(" 짝수의 개수 :  %d \n", nCount);
		System.out.printf(" 짝수의 총점 :  %d \n", nSum);
		System.out.printf(" 짝수의 평균 :  %d \n", Avg);
		
	}
}
