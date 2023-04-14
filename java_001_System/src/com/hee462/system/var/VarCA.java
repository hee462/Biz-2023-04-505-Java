package com.hee462.system.var;

public class VarCA {
	
	public static void main(String[] args) {
		
		boolean bYes = true;
		int intNum1 = 30;
		int intYes1 = 0;
		/*
		 *  = 오른쪽의 연산식 결과에 따라서 왼쪽의 변수를 맞는 타입으로 지정해야한다.
		 *  왼쪽의 변수 타입은 미리 지정되어 있고, 지정된 타입에 맞는 결과를 저장해야 한다.
		 *  
		 *  intNum1 % 2 의 연산 최종 결과가 정수 0,1이므로 그결과는 정수형으로 미리 선언된 intYes1만 저장할수있다
		 *  
		 *  ~~~ == 0 의 연산최종결과는 boolean 형의 true , false 이므로 그결과는 미리선언된 bYes에만 저장할수있다.
		 */
		intYes1 = intNum1 % 2;
		bYes = intNum1 % 2 == 0;
		
		
	}

}
