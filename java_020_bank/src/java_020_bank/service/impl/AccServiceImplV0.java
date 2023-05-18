package java_020_bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java_020_bank.model.AccDto;
import java_020_bank.model.utils.Line;
import java_020_bank.service.AccService;

public class AccServiceImplV0 implements AccService{
	List<AccDto> aList;
	
	Scanner scan ;
public AccServiceImplV0() {
	aList = new ArrayList<>();
	scan = new Scanner(System.in);
	// TODO Auto-generated constructor stub
}
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		
	}

	
	String str;
	String buId;
	public void inout() {
		System.out.println(Line.dLine(100));
		System.out.println("은행 업무 시작 >>");
		System.out.println(Line.sLine(100));
		AccDto aDto = new AccDto();
		while(true) {
			System.out.println("고객ID(%04d) >>"  );
			System.out.println(" 원하시는 업무를 입력해주세요(입금 / 출금) ");
			str = scan.nextLine();
			try {
				if(str.equals("입금")) {
					
				}else if(str.equals("출금")) {
					
				}
				
				
			} catch (Exception e) {
				System.out.println("입금 또는 출금만 입력가능합니다.");
				continue;
			}
		}
		
		
	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
