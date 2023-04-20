package com.hee462.controller;

public class ControllerB {
	public static void main(String[] args) {

		int rndNum = (int) (Math.random() * 50) + 51;
		int primeCount = 0;
		// i 을 2 ~ 자신까지 -1 까지 연속된 정수를 만들어 내는 코드
		for (int index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				// System.out.println(rndNum + " 소수가 아님");
				primeCount++;
				break;

			}

		}
		if (primeCount > 0) {
			System.out.println(rndNum + " 소수가 아님");
		} else {
			System.out.println("소수" + rndNum);
		}
		
		// 위 코드보다 실용적인 코드
		if (primeCount == 0) {
			System.out.println(rndNum + "는 소수");
		} else {
			System.out.println(rndNum + "는 소수가 아님");
		}
		// yesNo flag 변수
		boolean isPrime = true;
		for( int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0 ) {
				isPrime = false;
				break;
			}
			System.out.println(isPrime);
		}
		
		
		
		
		
		
	}
}