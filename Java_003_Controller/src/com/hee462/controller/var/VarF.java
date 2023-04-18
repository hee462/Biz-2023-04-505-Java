package com.hee462.controller.var;

public class VarF {
	public static void main(String[] args) {
		String str = "Republic of Korea";
		char cVar = str.charAt(3);
		System.out.println(cVar);
		System.out.println(str.length());
		
		//length 는 문자열 갯수 알려줌
		for(int i = 0; i < str.length() ; i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		
	}
}
