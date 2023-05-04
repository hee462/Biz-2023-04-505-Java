package com.hee462.scanner.exec;

import java.util.Scanner;

public class ScannerD {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			int rndNum = (int) (Math.random() * 10) + 1;
			int num = 0;
			String strNum;

			while (true) {
				System.out.println(" 1 ~ 10 까지 정수를 입력하세요");
				System.out.println("QUIT : 입력시 종료");
				strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println(" GAME OVER");
					return;
				}
				
				try {
					num = Integer.valueOf(strNum);
					if (num == rndNum) {
						System.out.println(" 잘했어요");
						break;
					}
					if(num > rndNum) {
						System.out.println("down");
						
					}else if(num < rndNum) {
						System.out.println("up");
					}
				} catch (Exception e) {
					System.out.println(" 정수만 입력해 주세요");
				}

			}
			if (strNum.equals("QUIT")) {
				return;

			}
		}

	}
}
