package com.hee462.controller;

public class ControllerD {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;

			int index;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}
			}
			if (rndNum <= index) {
				System.out.println(rndNum + "소수");
			}

		}
		

	}
}