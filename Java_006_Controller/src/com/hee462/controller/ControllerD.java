package com.hee462.controller;

public class ControllerD {
	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0;
			}
		}

		return rndNum;
	}

	public static void main(String[] args) {
		
		int sumNum = 0;
		int total = 0;
		for (int i = 0; i < 100; i++) {
			int rndNum = prime();

			if (rndNum > 0) {
				total++;
				sumNum += rndNum ;

			}

		}
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d \n" , total ,sumNum );
		
	}
}
