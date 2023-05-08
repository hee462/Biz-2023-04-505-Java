package com.hee462.scanner.exec;

import java.util.Scanner;

public class ScannerF {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 정수형 배열 6개를 만들어라
		int[] arNums = new int[6];
		int num = 0;
		String strNum;
		int index = 0; // nums 의 '어느 위치' 에 저장하는지 알려줌
		// 정수를 찾아 배열 숫자를 맞는지 확인하고 배열에 저장하는 반복문
		while (true) {
			// 1 ~ 45까지 랜덤수
			int rndNum = (int) (Math.random() * 45) + 1;
			// rndNum 과 배열안의 숫자가 맞는지 확인
			for (int i = 0; i < arNums.length; i++) {
				if (arNums[i] == rndNum) {
					rndNum = (int) (Math.random() * 45) + 1; // 중복된 값을 새로 만드는 코드
					i = -1; // 배열 은 0부터 시작함으로 -1을 빼주고 초기화하여 각 배열마다 숫자를 확인하는 코드
				}
			}
			// 정수 찾는 반복문
			while (true) {
				System.out.println("정수를 입력하세요");
				System.out.println("QUIT : 입력시 종료");
				strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println(" GAME OVER");
					return;
				}

				try {
					num = Integer.valueOf(strNum);
					if (num < 0 || num > 45) {
						System.out.println(" 1 ~ 45 까지 정수를 입력하세요");
						// nums 배열의 "위치" 에 저장할것인가?
						// index 는 횟수 , arNums[] 안에 num 값을 저장한다
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
			index++; // 증가시켜 num값을 배열에 저장한다
			// 배열의 길이만큼만 저장하고 멈춘다.
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
