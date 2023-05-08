package com.hee462.classes.exec;

public class ClassA {

	public static void main(String[] args) {
		// 정수형 배열 10개 생성
		int[] rndNums = new int[10];
		// 개별요소 (0번 요소 )에 값 저장
		rndNums[0] = (int) (Math.random() * 51) + 50;

		// 정수형 배열 10개의 요소 51 ~ 100까지 랜덤수 저장
		for (int i = 0; i < rndNums.length; i++) {
			rndNums[i] = (int) (Math.random() * 51) + 50;

		}
		for (int i = 0; i < rndNums.length; i++) {

			if (rndNums[i] % 2 == 0) {

				System.out.println("처음으로 짝수가 저장된 요소 : " + rndNums[i]);
				System.out.println(" 횟수 : " + i);
				break;
			}
		}
	}
}