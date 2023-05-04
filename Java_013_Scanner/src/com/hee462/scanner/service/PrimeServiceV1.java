package com.hee462.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {
	

    private	Scanner scan = new Scanner(System.in);
    
	public int getNum() {

		int num = 0;
		// 키보드가 정확히 입력이 되었는가 확인
		while (true) {

			System.out.println("3이상 양의 정수를 입력하세요");
			System.out.println(" 정수 (QUIT :  종료)>>");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(strNum);
				if (num >= 3) {
					break;
				}

				break;
			}

			catch (Exception e) {
				// TODO: handle exception
				System.out.println(" 정수만을 정확히 입력해 주세요");
			}
		}
		return num;

	}

	// 매개 변수를 통하여 전달받은 num 변수의 값이
	// prime 이 아니면 -1을 return ,prime 이면 num 변수의 값을 return
	public  int primeYesNo (int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return -1;
			}

		}
		return num;

	}
}
