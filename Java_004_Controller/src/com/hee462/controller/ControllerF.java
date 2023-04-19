package com.hee462.controller;

public class ControllerF {
	public static void main(String[] args) {

		int rndNum = (int) (Math.random() * 50) + 51;
		for (int index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				System.out.println("소수가아님");
			}
		}
	}
}
