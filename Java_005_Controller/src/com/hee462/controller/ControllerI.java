package com.hee462.controller;

public class ControllerI {
	/*
	 * 
	 * Prime() method {} 내에서 선언했던 rndNum 변수를
	 * 매개변수(parameter[받는쪽]) 로 변경하였다.
	 * 매개변수는 스스로 초기화 할수없다.
	 * 누군가 prime() method를 호출하면서
	 * 값을 전달해주어야만 그 갑승로 초기화 할 수 있다.
	 * prime(int rndNum = 0 )과 같은 코드 불가
	 * 
	 * main() 에서 prime(55) 와 같은 코드가 실행될때,
	 * 매개변수 값이 초기화된다.
	 * 
	 * 
	 */
	public static boolean prime(int rndNum) {
		int rndNum = (int) (Math.random() * 50) + 51;
			return prime(rndNum);
		}

		
	

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			//main 에서 랜덤수를 만들고
			int mainrndNum = (int) (Math.random() * 50) + 51;
			/*
			 * prime() method에게 "전달해주기"
			 * prime() method에가 mainrndnNum 변수에 저장된 값을 "전달해주기"
			 * 이때 mainrndNum 를 argument[보내느쪽] 라고 한다.
			 */
			if (prime(mainrndNum)) {
				System.out.println("소수");
			} else {
				System.err.println("소수아님");
			}
		}

	}
}