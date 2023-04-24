package com.hee462.classes.exec;

import com.hee462.classes.module.ServiceA;

public class ExecJ {
	
	public static void main(String[] args) {
		ServiceA sum = new ServiceA();
		int rndNum1 = (int) (Math.random() * 50) + 51;
		int rndNum2 = (int) (Math.random() * 50) + 51;
		int result = sum.add(rndNum1, rndNum2);

		System.out.println("결과 : "+ result);
	}
}