package com.hee462.classes.exec;

import com.hee462.classes.module.ServiceE;

public class ExecN {
	public static void main(String[] args) {

		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMath = (int) (Math.random() * 50) + 51;

		ServiceE serviceE = new ServiceE();
		serviceE.score(intKor, intEng, intMath);

	}
}
