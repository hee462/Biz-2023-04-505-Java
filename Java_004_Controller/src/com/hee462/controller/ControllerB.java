package com.hee462.controller;

public class ControllerB {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int intScore = (int) (Math.random() * 50) + 51;
			if (intScore % 2 == 0) {
				System.out.println(intScore + " 짝수");
			} else if (intScore % 2 == 1) {
				System.err.println(intScore + " 홀수");
			}
		}

	}
}