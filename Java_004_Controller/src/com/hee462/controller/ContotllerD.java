package com.hee462.controller;

public class ContotllerD {
	public static void main(String[] args) {
		/*
		 * 랜덤수 51 ~ 100가지 범위안에서 짝수의 갯수를 출력하기
		 */
		int nCount = 0;
		for (int i = 0; i < 100; i++) {
			int intScore = (int) (Math.random() * 50) + 51;
			if(intScore % 2 == 0) {
				nCount ++;
			}

		}
		System.out.printf("짝수의 개수 :  %d \n" , nCount);
	}
}