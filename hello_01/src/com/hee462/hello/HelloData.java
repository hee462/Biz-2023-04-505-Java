package com.hee462.hello;

public class HelloData {
	
	public static void main(String[] args) {
		System.out.println("Hello Korea");
		System.out.println("Hello" + "Korea");
		System.out.println("Hello            Korea");
		System.out.println("Hello"           +             "Korea");
		System.out.println(30 + 40);
		System.out.println("30" + "40");
		System.out.println("30 + 40");
		
		// 30 + 40 = 70
	   System.out.println("30 + 40 = 70");
	   System.out.println("30 + 40 =" + 30 + 40);
	   
	   // "30 + 40" + 30 을 연산하려고 시도
	   // 이 연산은 문자열 + 숫자의 연산이다.
	   // 이럴때는 숫자 데이터인 30을 문자열 30으로 바꿔버린다.
	  System.out.println("30 + 40 = " + "30" + 40);
	  System.out.println("30 + 40 = 30" + 40);
	  System.out.println("30 + 40 = " + "30" + "40");
	  System.out.println("30+ 40 = " + (30 + 40));
	  System.out.println( 30 + 40 + " = 30 + 40");
	  System.out.println("30 * 40 = " + 30 * 40);
      //System.out.println("30 - 40 = " + 30 - 40);
      //System.out.println("30" - "40");
      //System.out.println("30" * "40");
      //System.out.println("30" / "40");
	  
      System.out.println("30" + "40");
	  
	}
}
