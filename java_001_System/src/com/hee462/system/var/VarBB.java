package com.hee462.system.var;

public class VarBB {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		intNum1 = 10;
		floatNum1 = intNum1 + 10; // 20.0f 출력
		floatNum1 = floatNum1 + 1.2f;
		System.out.println(floatNum1); //21.2f 출력
		
		floatNum1 = floatNum1 + 0.5f;
		System.out.println(floatNum1); //21.7f 출력
		/*
		 * java는 float를 int 로 강제 형변환 할 때 소수점 이하를 무조건 버린다.
		 */
		intNum1 = (int)floatNum1;
		System.out.println(intNum1);  //21 출력 -> 소수점 삭제
		
		
		
		
	}

}
