package com.hee462.classes.arrays;

public class ArrayC {
	
	public static void main(String[] args) {
		int[]nums = new int[10];
		
		nums[0] = 33;
		nums[1] = 36;
		nums[2] = 34;
		nums[3] = 50;
		nums[4] = 35;
		nums[5] = 38;
		nums[6] = 37;
		nums[7] = 73;
		nums[8] = 53;
		nums[9] = 93;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		
		// num0,num1,num2
		for(int index = 0 ;  index < 10 ; index++) {
			System.out.println(nums[index]);
			
		}
	}

}
