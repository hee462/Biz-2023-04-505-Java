package com.hee462.classes.arrays;

public class ArrayE {
	public static void main(String[] args) {
		// 정수형 nums 선언하고 index 0번 부터 정수 1~10까지 모두 더하시오
		int[] nums = new int[10];
		for (int index = 0; index < 10; index++) {
			nums[index] = index + 1;
		}
		// 저장된 값 중 짝수만 출력하시오
		for (int index = 0; index < 10; index++) {
			if (nums[index] % 2 == 0) {
				System.out.println(nums[index]);
			}
		}
		// 저장된 값 중 소수만 출력하시오
		for (int i = 0 ; i < 10; i++) {
			for (int index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;			
				}
			}
			if(nums[i] == i) {
				System.out.println(nums[i]+"는 소수");
			}
		
		}
	}
}