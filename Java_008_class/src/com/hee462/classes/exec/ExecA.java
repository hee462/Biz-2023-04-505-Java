package com.hee462.classes.exec;

import com.hee462.classes.module.ServiceA;

public class ExecA {
	public void main(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		int rndnum1 = (int) (Math.random() * 51) + 51;
		int rndnum2 = (int) (Math.random() * 51) + 51;
		int rndnum3 = (int) (Math.random() * 51) + 51;
		int rndnum4 = (int) (Math.random() * 51) + 51;
		int rndnum5 = (int) (Math.random() * 51) + 51;
		int rndnum6 = (int) (Math.random() * 51) + 51;
		int rndnum7 = (int) (Math.random() * 51) + 51;

		ServiceA serviceA = new ServiceA();
		serviceA.score(rndnum1, rndnum2, rndnum3, rndnum4, rndnum5, rndnum6, rndnum7);
	}

}
