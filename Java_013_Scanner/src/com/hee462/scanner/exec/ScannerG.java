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

			int rndNums = (int) (Math.random() * 45) + 1;
			int searchIndex;
			for (searchIndex = 0; searchIndex < nums.length; searchIndex++) {
				if (rndNums == nums[searchIndex]) {
					break;
				}
			}
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
						nums[index++] = num;
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
			if (index >= nums.length) {
				break;
			}
	
		}
		
		for( int i= 1; i < nums.length ; i++ ) {
			for(int j =0 ; j <nums.length; j++) {
				if(nums[i] >nums[j]) {
					int _tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = _tmp;
				}
			}
		
		}
		for( int i = 0; i <nums.length; i++) {
			System.out.printf("%d \t" , nums[i]);
		}
	}
}
