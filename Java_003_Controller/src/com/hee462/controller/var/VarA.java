package com.hee462.controller.var;

public class VarA {
	public static void main(String[] args) {
		int intKor = 90;
		int intEng = 90;
		int intMath = 80;

		int intTotal = (intKor + intEng + intMath);
		//소수점 이하 평균 오차를 찾기위해 정수를 실수(float)로 강제 형변환하여 연산수행
		float floatAvg = (float)((intKor + intEng + intMath) / 3f);
		
		System.out.println("국어 : " + intKor );
		System.out.println("영어 : " + intEng );
		System.out.println("수학 : " + intMath );
		
		System.out.print("총점" + intTotal + "," + " 평균" + floatAvg);
		/*
		 * 선생님 코드
		 * 
		 * int intTotal =intKor+intEng+intMath;
		 * float floattAvg = intTotal /3 ;
		 * 
		 * system.out.printf("국어 : %3d" , intKor);
		 * system.out.printf("영어 : %3d" , intEng);
		 * system.out.printf("수학 : %3d" , intMath);
		 *
		 * system.out.printf("총점 : %3d" , "평균 : %5.2f\n" , intTotal ,floatAvg);
		 */
		
	}
}
