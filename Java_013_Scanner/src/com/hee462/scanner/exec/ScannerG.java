package com.hee462.scanner.exec;

import java.util.Scanner;

public class ScannerG {
	public static void main(String[] args) {

		int[] nums = new int[6];
		int num = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);

		// nums 배열 요소에 한번도 저장되 지 않는 rndNum 값 만들기
		while (true) {
			// rndNums 값과 nums 값이 중복 생성되지 않게 드는 코드
			int rndNums = (int) (Math.random() * 45) + 1;
			int searchIndex;  // 중복된 값을 알아보는 횟수
			for (searchIndex = 0; searchIndex < nums.length; searchIndex++) {
				if (rndNums == nums[searchIndex]) {
					break;
				}
			}
			// 중복된 횟수가 배열의 길이보다 작으면 계속
			if (searchIndex < nums.length) {
				continue;
			}

			while (true) {

				System.out.println(" 정수를 입력하세요");
				String strNum = scan.nextLine();
				try {
					num = Integer.valueOf(strNum);
					if (num < 0 || num > 45) {
						System.out.println(" 1 ~ 45 범위 내 정수를 입력하세요");
					} else if (num == rndNums) {
						nums[index++] = num;  // index  증가하여 nums[] 배열에 num  값 저장
 						System.out.println("정답");
						break;
					} else if (num > rndNums) {
						System.out.println("down");
					} else if (num < rndNums) {
						System.out.println("up");
					}

				} catch (Exception e) {
					System.out.println(" 정수만 입력하세요");
					// TODO: handle exception
				}
			}
			if (index >= nums.length) {  // nums[] 안에 num 값을 다 저장하면 break;
				break;
			}

		}
// 오름차순 나열
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int _tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = _tmp;
				}
			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d \t", nums[i]);
		}
	}
}
