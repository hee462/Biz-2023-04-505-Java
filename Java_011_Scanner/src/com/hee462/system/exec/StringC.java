package com.hee462.system.exec;

public class StringC {
	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 =  new String("Korea");
		String str3 = "KOREA";
		
		//	str1 문자열 변수와 str2 문자열 변수(객체 변수)의 값이 같은가 비교하기
		boolean bYes = str1==str2; // 문자열 비교 절대 

		// str1 변수에 담기 문자열과 str2 변수에 담긴 문자열이 같은가
		//비교하여 결과를 bYes에 저장
		bYes = str1.equals(str2);
		bYes = str2.equals(str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
		
		// equals() method 는 저장된 영문자의 대소문자를 서로 다른 문자열로 본다
		bYes = str2.equals(str3);
		System.out.println(bYes);
		
		//영문자를 비교할때 대, 소문자 구문없이 비교하고 싶을때
		//KOREA == Korea 가 같음을 확인 하고 싶을때
		bYes = str1.equalsIgnoreCase(str3);
		System.out.println(bYes);
		
		
		/*
		 * equalsIgnoreCase()
		 *  변수에 저장된 문자열의 배열은 일치하고
		 *  대소문자가 섞여 있을때는 같은 값으로 본다.
		 */

		str1 = "Republic of KOrea";
		str1 = "Republic of Korea";
		str1 = "Republic of          KOrea";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
	}
	
}
