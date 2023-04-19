package com.hee462.controller;

public class ControllerA {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int intScore = (int) (Math.random() * 50) + 51;
			if (51 > intScore || intScore < 100) {

			}
			System.out.print(intScore);
			if (intScore < 51 || intScore > 100) {
				System.err.println(" Over");
			}else {
				System.out.println(" Ok");
			}
			
		}

	}

}
