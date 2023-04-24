package com.hee462.classes.exec;

import com.hee462.classes.module.MyClassB;

public class ExecF {
	/*
	 * (우리가) 생성한 MyClassB 클래스가 변수를 선언하는 키워드가 되었다.
	 * java에서 기본적으로 제공하는 키워드 외에 개발자가 생성한 클래스도 변수를 선언하는 키워드가 된다.
	 * 
	 */
	
	public static void main(String[] args) {
		MyClassB myB = new MyClassB();
		System.out.println( myB.add(30, 40));
		System.out.println( myB.add(30.0f, 40.0f));
		System.out.println( myB.add("대한", "민국"));
	}
}
