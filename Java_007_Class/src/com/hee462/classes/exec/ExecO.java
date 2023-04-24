package com.hee462.classes.exec;


import com.hee462.classes.module.ServiceF;

public class ExecO {
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 50) + 51;
		int num2 = (int) (Math.random() * 50) + 51;
		int num3 = (int) (Math.random() * 50) + 51;
		int num4 = (int) (Math.random() * 50) + 51;
		int num5 = (int) (Math.random() * 50) + 51;
		int num6 = (int) (Math.random() * 50) + 51;
		int num7 = (int) (Math.random() * 50) + 51;

		ServiceF serviceF = new ServiceF();
		serviceF.score(num1, num2, num3, num4, num5, num6, num7);

	}
}
