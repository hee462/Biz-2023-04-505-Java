package com.hee462.controller;

public class ControllerC {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				//System.out.println(rndNum + " 는 소수아님");
				break;
			}
		}
		System.out.printf("rnd %d , index %d\n",rndNum ,index);
		/*
		 * for() 반복문에서 최대값과 index의 관계
		 * 최대값표현 index < 최대값 또는 index <= 최대값으로 표현을 한다.
		 *  for() 반복문이 몇번 반복 될 것인가를 결정 짓는 연산식이다.
		 *  for() 반복문은 중간에 break를 만나서 반복문실행을 중단할수 있다.
		 *  또는 그렇지 않고 모든 조건문대로 반복문이 실행완료 될수 있다.
		 *  
		 *  for() 반복문이 실행완료되면.
		 *  rndNum <= index 조건이 true가 된다.
		 *  이 조건을 검사하려면 index 변수를 for() 이전에 선언
		 */
		// > 의 반대 <= 이다.
		if(rndNum <= index) {
			System.out.println(rndNum + "는 소수");
		} else {
			System.out.println(rndNum + " 는 소수 아님");
		}
	}

}
