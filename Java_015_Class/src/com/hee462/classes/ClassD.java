package com.hee462.classes;

import java.util.ArrayList;

public class ClassD extends ClassC {
	/*
	 * Constructor(생성자 method)
	 * 클래스를 객체로 생성할 때 호출 하는 method
	 * new ClassD() 와 같은 코드를 사용하면 감춰진 기본 생성자와 호출되어 객체를
	 * 사용할 수 있도록 준비해 준다.
	 * 
	 * 생성자 method 는 기본적으로 아무런 코드가 없지만
	 * Java 언어 컴파일러에 의해서 클래스를 객체변수로 만들어주는 코드가 실행된다,
	 * 
	 * 이 생성자 method에 임의의 코드를 추가하여
	 * 꼭 필요한 변수를 생성하거나 하는 일을 수행 할 수 있다.
	 * 
	 * 여기에서는 numList 객체 변수를 사용 할 수 있도록 준비하는 코드 추가
	 */
	public ClassD() {
		// ClassD classD = new ClassD() 코드가 실행 될때
		// numList 객체변수를 사용할 수 있도록 만드는 코드가 (자동으로) 실행된다.
		numList = new ArrayList<>();
		}

	@Override
	public void printList() {
		System.out.println("리스트 출력");
		/*
		 * classC 에서 NumList 객체변수를 선언만 해둔 상태이다. 객체 변수를 선언만 한 상태에서는 method 등을 사용할 숭 없다
		 * 선언만 한 객체 변수의 method등을 호출하면, NullPointerException 이 발생된다.
		 */
		System.out.println(numList.toString());

	}

}
