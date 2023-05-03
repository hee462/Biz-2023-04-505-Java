package com.hee462.system.exec;

import java.util.Scanner;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println(" 두 개의 정수를 입력하세요");
			String strNum1 = "";
			String strNum2 = "";

			while (true) {

				System.out.println(" 정수 1 (종료 : QUIT) >>");

				strNum1 = scan.nextLine();
				if (strNum1.equals("QUIT")) {
					break;
				}

				try {
					num1 = Integer.valueOf(strNum1);

				} catch (Exception e) {

					System.out.println("정수1은 정수값만 입력해야 합니다.");
					continue;
				}
				break;

			}
			// try- catch 문에서 나간건지 QUIT를 입력해서 나간건지 확인하는 코드
			if (strNum1.equals("QUIT")) {
				break;
			}

			while (true) {

				System.out.print(" 정수2 (종료 : QUIT) >> ");
				strNum2 = scan.nextLine();
				if (strNum2.equals("QUIT")) {
					break;
				}
				try {

					num2 = Integer.valueOf(strNum2);
				} catch (Exception e) {
					System.out.println("정수2은 정수값만 입력해야 합니다.");
					continue;

				}
				break;
			}
			if (strNum2.equals("QUIT")) {
				break;
			}
			System.out.printf(" %d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf(" %d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf(" %d x %d = %d\n", num1, num2, num1 * num2);
			System.out.printf(" %d ÷ %d = %d\n", num1, num2, num1 / num2);
		}
		System.out.println("GAME OVER");

	}
}
