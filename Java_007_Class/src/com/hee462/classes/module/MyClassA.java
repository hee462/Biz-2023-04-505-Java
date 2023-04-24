package com.hee462.classes.module;

public class MyClassA {
	/*
	 * 
	 * public keyword만을 가진 method
	 *클래스와 이름이 같은 method
	 * 
	 */
	public MyClassA() {
		
	}
	// static 키워드가 없는 method()
	/*
	 * 2개의 매개변수를 통하여 정수 2개를 정달받고
	 * 전달받은 정수를 덧셈하여 return 하는 add() method
	 */
	public int add( int num1, int num2) {
		return num1 + num2;
	}
	
}
