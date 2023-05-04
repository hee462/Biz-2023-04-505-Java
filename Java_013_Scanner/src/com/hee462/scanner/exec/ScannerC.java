package com.hee462.scanner.exec;

import com.hee462.scanner.service.PrimeServiceV1;

public class ScannerC {
	public static void main(String[] args) {
		
		PrimeServiceV1 service = new PrimeServiceV1();
		
		while(true) {
			int num = service.getNum();
			if( num < 0) {
				break;
			}
			int result = service.primeYesNo(num);
			if(result >  0) {
				System.out.println(num + " 는 소수");
			}else{
				System.out.println(num + " 는 소수아님");
			}
		}
	
		
	}
}
