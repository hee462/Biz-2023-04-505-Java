package com.hee462.var;

public class VarB {
	 public static void main(String[] args) {
		
		 int num1 = 0;
		 int num2 = 0;
		 /*
		  * 변수에 어떤값을 저장, 할당, 대입하려면 반드시 먼저 선언되어야 한다.
		  */
		 num1 = 30;
		 num2 = 40;
		 
		 //sum1 선언하고, 두 변수의 덧셈 결과 저장
		 //int sum1 = 0;
		 //sum1 = num1 + num2;
		 
		 // sum1 선언과 동시에 두 변수의 덧셈 결과 저장
		int sum1 = num1+num2;
		
		System.out.println(sum1);
		
		 
	}
}
