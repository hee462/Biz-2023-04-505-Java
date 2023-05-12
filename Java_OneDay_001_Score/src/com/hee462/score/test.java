package com.hee462.score;

public class test {
	public static void main(String[] args) {
		int rndNum = (int)(Math.random()*100)+1;
			System.out.println(rndNum);
			
			if(rndNum  > 100 ) {
				System.out.println(rndNum + "범위를 넘었습니다");
			} else if(rndNum <1) {
				System.out.println(rndNum + "범위를 넘었습니다");
			}
	}
}
