package com.hee462.classes.exec;

import com.hee462.classes.module.ServiceD;

public class ExecM {
	public static void main(String[] args) {
		int rndNum1 = (int)(Math.random()*50)+51;
		int rndNum2 = (int)(Math.random()*50)+51;
		
		ServiceD serviceD = new ServiceD();
		serviceD.add(rndNum1, rndNum2);
		
	} 
	
}
