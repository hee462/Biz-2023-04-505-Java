package com.hee462.classes.exec;

public class ExecJ {

	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {

		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		int lastIndex = -1;
		int lastNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				lastNum = nums[i];
				lastIndex = i;
			}
		}
		int firstIndex = -1;
		int firstNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				firstNum = nums[i];
				firstIndex = i;
				break;
			}

		}
		if (firstIndex > -1) {
			System.out.println("마지막 index : " + lastIndex);
			System.out.println("마지막 prime : " + lastNum);
			System.out.println("첫번째 index : " + firstIndex);
			System.out.println("첫번째 prime : " + firstNum);

		}else {
			System.out.println("없음");
		}
		
		
		
		
		
		
	}
}
