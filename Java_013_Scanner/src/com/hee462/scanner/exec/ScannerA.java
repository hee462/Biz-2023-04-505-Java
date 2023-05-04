package com.hee462.scanner.exec;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ScannerA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 키보드가 정확히 입력이 되었는가 확인
		int num = 0;
		while (true) {

			System.out.println("정수를 입력하세요");
			System.out.println(" 정수 >>");
			String strNum = scan.nextLine();

			try {
				num = Integer.valueOf(strNum);
				break;
			}

			catch (Exception e) {
				// TODO: handle exception
				System.out.println(" 정수만을 정확히 입력해 주세요");
			}
		}

		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;

			}
			

		}

	}
}
