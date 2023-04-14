package com.hee462.system.var;

public class VarBA {
	
	public static void main(String[] args) {
	
		int intNum1 = 0;       // 작은 정수
		long longNum1 = 0;     // 큰 정수
		
		
		float floatNum1 = 0.0f; // 단정도 실수
		double douNum1 = 0.0;   // 배정도 실수
		/*
		 * 데이터의 형변환(type cast, convert)
		 */
		longNum1 = intNum1; // int형 데이터를 자동으로 long형데이터로 변경  -> 자동형변환 , 암시적형변환
		intNum1 = (int)longNum1; // long형데이터를 강제로 int형데이터로 변경 -> 강제형변환 , 명시적형변환
		
		floatNum1 = (float)douNum1; // double형 데이터를 강제로 float형데이터로 변경 -> 강제형변환 , 명시적형변환 
		douNum1 = floatNum1; // float형 데이터를 자동으로 double형 데이터로 변경  -> 자동형변환 , 암시적형변환
		
		
		
		
		
	}

}
