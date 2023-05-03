package com.hee462.classes;

import java.util.Scanner;

public class ClassH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = -1;
		int num2 = -1;
		
		do {
			System.out.println("두 개의 정수를 입력하세요");
			System.out.println("-1 을 입력하면 종료합니다");
		   } while(true){
			System.out.print("정수1 >> ");
			num1 = scan.nextInt();
			
		
		
			System.out.print("정수2 >> ");
			num2 = scan.nextInt();
		
			System.out.printf("%d + %d = %d\n",
						num1, num2, num1 + num2);
		}
		
		System.out.println("GAME OVER!!");
	}

}