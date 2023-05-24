package com.hee462.bank.exec;

import java.util.Scanner;

import com.hee462.bank.service.BankService;

public class DBExecE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService bankService = new BankService();
		
		while(true) {
			System.out.println("=".repeat(100));
			System.out.println("대한은행 고객관리 시스템");
			System.out.println("=".repeat(100));
			
			System.out.println("수행할 업무를 선택하세요");
			System.out.println("\t1.고객 추가");
			System.out.println("\t2.고객 정보 수정");
			System.out.println("\t3.고객 정보 삭제");
			System.out.println("\t4.고객 리스트");
			System.out.println("\t5.고객 정보(계좌) 조회");
			System.out.println("\t6.계좌개설");
			System.out.println("\t9.업무종료");
			System.out.println("-".repeat(100));
			System.out.println("업무 선택  >>");
			String strSelect = scan.nextLine();
			int intSelect = 0;
			try {
				intSelect = Integer.valueOf(strSelect);
			} catch (Exception e) {
				System.out.printf("업무 선택을 잘못하였습니다(%s)", strSelect);
				// TODO: handle exception
				continue;
			}
			if(intSelect ==9) break;
			else if(intSelect ==1)bankService.insertBuyer();
			else if(intSelect ==2)bankService.update();
			else if(intSelect ==3)bankService.delete();
			else if(intSelect ==4)bankService.printBuyerList();
			else if(intSelect ==5)bankService.findUserInfo();
			else if(intSelect ==6)bankService.makeAcount();
			
		}
		System.out.println("업무 끝 ~ 퇴근이당!");
//		bankService.insertBuyer();
//		bankService.printBuyerList();
	}
}
