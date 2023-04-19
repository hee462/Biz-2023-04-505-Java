package com.hee462.controller;

public class ControllerC {
	/*
	 * 100 개의 랜덤수를 생성하기
	 * 생선된 랜덤수가 3의 배수인가 판별
	 * 아니면 2의 배수인가 판별
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int intScore = (int) (Math.random() * 50) + 51;
			if (intScore % 3 == 0) {
				System.out.println( intScore +" 3의 배수");
			} else if (intScore % 2 == 0) {
				System.out.println(intScore + " 2의 배수");
			}

		}

	}

}
