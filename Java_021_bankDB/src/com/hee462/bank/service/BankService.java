package com.hee462.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.hee462.bank.config.DBContract;
import com.hee462.bank.models.AccDto;
import com.hee462.bank.models.AccListDto;
import com.hee462.bank.models.BuyerDto;
import com.hee462.bank.service.impl.AccListServiceImplV1;
import com.hee462.bank.service.impl.AccServiceImplV1;
import com.hee462.bank.service.impl.BuyerServiceImplV1;
import com.hee462.bank.utils.Line;

public class BankService {
	protected final Scanner scan;

	protected List<BuyerDto> buyerList;
	protected List<AccDto> accList;
	protected final BuyerService buyerService;
	protected final AccService accService;
	protected final AccListService accListService;

	public BankService() {
		accService = new AccServiceImplV1();
		buyerService = new BuyerServiceImplV1();
		scan = new Scanner(System.in);
		accListService = new AccListServiceImplV1();
	}

	public void printBuyerList() {
		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("대한은행 고객 리스트");
		System.out.println("=".repeat(100));
		System.out.println("ID\t이름\t전화번호\t주소\t생년월일\t직업");
		System.out.println("-".repeat(100));
		for (BuyerDto buyerDto : buyerList) {
			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", buyerDto.buAddr);
			System.out.printf("%s\t", buyerDto.buBirth);
			System.out.printf("%s\n", buyerDto.buJob);
		}
		System.out.println("=".repeat(100));

	}

	public void findByBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 고객ID 를 입력하세요");
		System.out.print("ID >> ");
		String strId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strId);
		if (buyerDto == null) {
			System.out.println("조회한 고객ID 는 없는 데이터 입니다");
		} else {
			System.out.println(buyerDto.toString());
		}
	}

	public void insertBuyer() {

		System.out.println("=".repeat(100));
		System.out.println("고객정보 등록");
		System.out.println("=".repeat(100));

		System.out.print("고객 ID >> ");
		String strBuId = scan.nextLine();

		System.out.print("고객명 >> ");
		String strBuName = scan.nextLine();

		System.out.print("전화번호 >> ");
		String strBuTel = scan.nextLine();

		BuyerDto buyerDto = new BuyerDto();
		buyerDto.buId = strBuId;
		buyerDto.buName = strBuName;
		buyerDto.buTel = strBuTel;
		buyerService.insert(buyerDto);

	}

	public void delete() {
		System.out.println("=".repeat(100));
		System.out.println("삭제할 고객ID 를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);
		if (buyerDto == null) {
			System.out.printf("%s 고객ID 는 없는 정보입니다", strBuId);
		} else {
			System.out.println(buyerDto.toString());
			System.out.println("고객정보를 정말 삭제할까요???(YES/NO)");
			String yesNo = scan.nextLine();
			if (yesNo.equals("YES")) {
				int result = buyerService.delete(strBuId);
				if (result > 0) {
					System.out.println("고객정보 삭제 완료~~");
				} else {
					System.out.println("고객정보 삭제 실패!!");
				}
			} else {
				System.out.println("삭제 취소!!");
			}
		}
	}

	public void update() {
		while (true) {
			System.out.println("수정할 고객 id 를 입력하세요");
			String strBuId = scan.nextLine();
			BuyerDto buyerDto = buyerService.findById(strBuId);
			if (buyerDto == null) {
				System.out.printf("%s, 고객 정보가 없습니다", strBuId);
				continue;
			}
			System.out.println(buyerDto.toString());
			System.out.printf("고객Id : %s\n", buyerDto.buId);

			System.out.printf("고객이름(%s)", buyerDto.buName);
			String strBuName = scan.nextLine();
			if (!strBuName.equals(""))
				buyerDto.buName = strBuName;

			System.out.printf("전화번호(%s)", buyerDto.buTel);
			String strBuTel = scan.nextLine();
			if (!strBuTel.equals(""))
				buyerDto.buTel = strBuTel;

			int result = buyerService.update(buyerDto);
			if (result > 0)
				System.out.println("변경 성공");
			else
				System.out.println("변경 실패");

			break;
		}
	}

	public void findUserInfo() {

		this.printBuyerList();

		System.out.println("조회할 고객ID를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);

		if (buyerDto == null) {
			System.out.println("고객ID 가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.printf("고객ID :  %s\n", buyerDto.buId);
			System.out.printf("이름 :  %s\n", buyerDto.buName);
			System.out.printf("전화번호 :  %s\n", buyerDto.buTel);
			System.out.printf("주소 :  %s\n", buyerDto.buAddr);
			System.out.println(Line.sLine(100));
		}

		List<AccDto> accList = accService.findByBuId(strBuId);
		if (accList.isEmpty()) {
			System.out.println("고객의 계좌정보가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호\t구분\t잔액");
			System.out.println(Line.sLine(100));
			for (AccDto accDto : accList) {
				System.out.printf("%s\t", accDto.acNum);

				int intDiv = 0;
				try {
					intDiv = Integer.valueOf(accDto.acDiv);

					System.out.printf("%s\t", DBContract.ACC_DIV[intDiv - 1]);

				} catch (Exception e) {
					System.out.printf("%s\t", "종류불명");
				}
				System.out.printf("%d\n", accDto.acBanlance);
			}
			System.out.println(Line.sLine(100));
		}

	}

	public void makeAcount() {
		/*
		 * 계좌번호 만들기 : 날짜 + 일련번호 1. 오늘날짜의 문자열 만들기 2. 계좌리스트에 오늘날짜에 해당하는 값이 있는지 검사 있으면 일련번호
		 * 추출하여 +1 하고 없으면 1로 설정
		 */
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYYMMdd");
		// 오늘 날짜의 문자열 만들기(20230524)
		String todayString = today.format(date);
		int maxNum = 0;

//		List<AccDto> accList = accService.selectAll();
//		for(AccDto aDto :accList) {
//			String tempDat =aDto.acNum.substring(0,todayString.length());
//			//날짜와 같은 데이터 있으면 일련번호 추출
//			if(tempDat.equals(todayString)) {
//				String strNum = aDto.acNum.substring(todayString.length());
//				int intNum = Integer.valueOf(strNum);
//				if(intNum > maxNum) maxNum = intNum;
//			}
//		}
//		maxNum++;
		maxNum = Integer.valueOf(accService.maxAcNum(todayString)) + 1;
		String acNum = String.format("%s%02d", todayString, maxNum);

		String strId = scan.nextLine();
		AccDto aDto = new AccDto();

		System.out.printf("계좌 번호 :", aDto.acNum);
		System.out.printf("계좌번호 >>> %s\n", aDto.acNum);
		System.out.print("계좌구분(1.입출금 2.적금 3.대출)  >>> ");
		String strDiv = scan.nextLine();
		System.out.printf("잔액10000원 >>> ");
		String strBalance = scan.nextLine();
		if (strBalance.equals("")) {
			strBalance = "10000";
		}
		System.out.println("=".repeat(100));
		aDto.acBuId = strId;
		aDto.acDiv = strDiv;
		aDto.acBanlance = Integer.valueOf(strBalance);
		int result = accService.insert(aDto);

		if (result > 0) {
			System.out.println(Line.dLine(100));
			System.out.println("계좌개설 완료");
			System.out.println(Line.dLine(100));

		}
	}

	public void insertAccList() {
		AccListDto alDto = new AccListDto();
		AccDto aDto = new AccDto();
		
		//고객 정보 확인
		//printBuyerList();
		//findUserInfo();
		String strAcNum = "";
		while(true) {
			System.out.println(Line.sLine(100));
			System.out.println("입출금 등록");
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호를 입력하세요");
			strAcNum = scan.nextLine();
			//계좌 번호를 사용하여 tbl_acc 테이블에서 데이터 조회
			//accDto에는 acNum 계좌번호에 해당하는 데이터가 모두 담긴 상태
			aDto = accService.findById(strAcNum);
			
			if(aDto ==null) System.out.println("계좌번호를 확인하세요.(%s),strAcNum");
			//continue; 선생님 코드
			else break;
		} 
		
		System.out.println(" 거래 구분 (1 : 입금 , 2 : 출금  , End : 종료) >>");
		String strAc = scan.nextLine();
		int inputMoney = 0;
		int outputMoney = 0;
		int total = aDto.acBanlance;
		if (strAc.equals("1")) {
			System.out.println("입금액 입력하세요");
			try {
				inputMoney = Integer.valueOf(scan.nextLine());
			//	System.out.println("1111");
				total += inputMoney;
			} catch (Exception e) {
				System.out.println(" 입금액은 숫자로 입력해주세요");
				
				// TODO: handle exception
			}
			
		} else if (strAc.equals("2")) {
			while(true){
				System.out.println("출금액 입력하세요 (종료: End)");
				if(strAc.equals("End"))break;
				try {
					outputMoney = Integer.valueOf(scan.nextLine());
					if(aDto.acBanlance < outputMoney) {
						System.out.printf("잔액(%d)이 부족합니다",aDto.acBanlance);
						continue;
					}else {
						total += outputMoney;
						break;
					}
				} catch (Exception e) {
					System.out.println(" 입금액은 숫자로 입력해주세요");
					// TODO: handle exception
				}
			}
		}else if( strAc.equals("End")) {
			System.out.println("업무를 종료합니다"); 
			
		}
	//	System.out.println("2222");
		// 잔액이 맞는지 확인해보기
//		if(1==1) {
//			System.out.println(total);
//			return;
//		}
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = today.format(date);
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		String timeString = time.format(date);
		alDto.aioDate = todayString;
		alDto.aioTime = timeString;
		alDto.acNum   = strAcNum;
		alDto.aioDiv  = strAc;
		alDto.aioInput  = inputMoney;
		alDto.aioOutput = outputMoney;
		//  새로 입력된 값을 result 에 담아서 제대로 입력됬는지 확인
		int result = accListService.insert(alDto);
		if(result < 1) {
			System.out.println("계좌 거래 실패");
			return;
		}
		// 잔액 업데이트 해주기
		// 새로운 잔액 저장
		aDto.acBanlance =  total;
		//업데이트
		int result2 = accService.update(aDto);
		System.out.println("계좌 거래 완료");
		System.out.printf("거래일자(%s) 잔액(%s) :" ,result ,result2);
	}

}
