package com.hee462.scanner.exec;

import java.util.Scanner;

import com.hee462.scanner.config.PublicConfig;

public class ScannerFA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arNums = new int[6];
		int num = 0;
		String strNum;
		int index = 0; 
		
		while (true) {
			// 1 ~ 45까지 랜덤수
			int rndNum = (int) (Math.random() * 45) + 1;
			// rndNum 과 배열안의 숫자가 맞는지 확인
			for (int i = 0; i < arNums.length; i++) {
				if (rndNum == arNums[i]) {
					rndNum = (int) (Math.random() * 45) + 1;  // 
					i = -1; 
				}
			}
			
			while (true) {
				System.out.println(PublicConfig.dLine(100));
				System.out.println("정수를 입력하세요");
				System.out.println("QUIT : 입력시 종료");
				strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println(" GAME OVER");
					return;
				}

				try {
					num = Integer.valueOf(strNum);
					System.out.println(PublicConfig.sLine(100));
					if (num < 0 || num > 45) {
						System.out.println(" 1 ~ 45 까지 정수를 입력하세요");
						
					} else if (num == rndNum) {
						arNums[index] = num;
						System.out.println(" 잘했어요");
						break;
					} else if (num > rndNum) {
						System.out.println("down");
					} else if (num < rndNum) {
						System.out.println("up");
					}

				} catch (Exception e) {
					System.err.println(" 정수만 입력해 주세요");
					continue;
				}
			}
			index++; 		
			if (index >= arNums.length) {
				break;
			}
			if (strNum.equals("QUIT")) {
				return;

			}
		}
		// 배열을 출력하고 게임을 끝낸다
		System.out.println("GAME OVER");
		for (int i = 0; i < arNums.length; i++) {
			System.out.println(arNums[i]);
		}

	}
}
