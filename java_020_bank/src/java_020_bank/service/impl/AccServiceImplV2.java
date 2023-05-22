package java_020_bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import java_020_bank.model.AccDto;
import java_020_bank.model.BuyerDto;
import java_020_bank.model.utils.AnsiConsol;
import java_020_bank.model.utils.Line;
import java_020_bank.model.utils.config;
import java_020_bank.service.AccService;
import java_020_bank.service.BuyerService;

public class AccServiceImplV2 implements AccService {
	/*
	 * 
	 * 신규계좌 등록하기 
	 * 1. 고객번호를 입력받고 
	 * 2. 고객번호가 고객정보 있는가 확인
	 *    BuyerServiceImplV1.getBuyer()method 를 사용하여 고객정보 찾기 없으면 
	 *    : 고객정보를 등록하세요 라고 메시지표현
	 * 3. 고객번호가 있으면 신규계좌를 생성 
	 *    : List(AccDto) type accList에 추가
	 * 
	 */
	protected List<AccDto> accList;
	protected BuyerService bService;
	protected Scanner scan;

	public AccServiceImplV2() {
		accList = new ArrayList<>();
		bService = new BuyerServiceImplV1A();
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	// 새로운 계좌번호를 자동으로 생성하기
	/*
	 * 계좌번호 fomat
	 *    -> 1000-2023-05-18-0001
	 * 
	 * "1000"       : 은행 코드
	 * "2023-05-18" : 계좌를 신설한 날짜
	 * "0001"       :  일련번호
	 * 
	 * 
	 */
	protected String getNewAccNum() {
		// 컴퓨터의 현재 시각을 get 하는 클래스
		// System.currentTimeMillis()
		//        1970.1.1 00: 00:00:000 부터 시작하여 현재시점까지 카운트된 밀리세컨드값
		// 이 값을 Date 클래스의 생성자에 전달하면
		// 현재 날짜, 시각 정보를 알수 있는 객체로 생성해 준다
		Date date = new Date(System.currentTimeMillis());
		// 계좌번호에 날짜 생성을 위하여 날짜값 String type으로 만들기
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		//date 값을 todayFormat형태로 바꿔서 todayString에 선언
		String todayString = todayFormat.format(date);
		// 최대값을 알아보기 위한 정수형 선언
		int maxNum =0;
		// 계좌번호 기본값
		String numBank ="1000";
		for(AccDto aDto : accList) {
			/*
			 * 1000-2023-05-18-0001
			 * 1000-2023-05-18-0002
			 * 1000-2023-05-18-0003
			 * 1000-2023-05-18-0004
			 * 1000-2023-05-18-0005
			 */
			String accNum = aDto.acNum;
			// 처음에 4글자 잘라서  bank에 코드 추출 -> 1000 추출을 위한 코드
			numBank = accNum.substring(0,4);
			// 날짜 부분 추출하기
			String numDate = accNum.substring(5, String.format("%s-%s",numBank, todayString).length()); 
			
			if(numDate.equals(todayString)) {
				// 일련번호 부분만 추출하기
				String lastNum = accNum.substring(String.format("%s-%s-", numBank,todayString).length());
				
				int intNum = Integer.valueOf(lastNum);
				// 가장 큰값을 찾기 위한 코드
				if(intNum>maxNum) maxNum = intNum; 
			}
			
		}// end for
		
		// maxNum 은 0 아니면 최대값
		// 신규 계좌번호 생성하는 코드
		String newNum = String.format("%s-%s-%04d", numBank,todayString,maxNum+1);
		
		return newNum;	
	}
	
	@Override
	public void accInit() {
		config.bankTitle("계좌생성");

		while (true) {
			String accNum = getNewAccNum();
			System.out.println(Line.sLine(100));
			System.out.println("생성된 계좌번호 : " + accNum);
			System.out.println(Line.sLine(100));
			
			
			String strId;
			while (true) {
				System.out.println("고객번호를 입력하세요");
				System.out.println("고객번호 >>");
				strId = scan.nextLine();
				if (strId.equals("QUIT"))
					break;
				try {
					int intId = Integer.valueOf(strId);
					strId = String.format("04%d", intId);
					//기존 고객인지 확인하기 위해서 ,고객번호랑 입력받은 고객번호랑 같은지 비교하는 코드
					BuyerDto bDto = bService.gerBuyer(strId);
					// 만약 값이 없다면 고객 등록
					if (bDto == null) {
						System.out.println(AnsiConsol.YELLOW("고객정보가 없습니다"));
						System.out.println("고객정보를 먼저 등록해주세요");
					} else {
						// 아니라면 기존 고객 정보 알려주기
						System.out.println(Line.dLine(100));
						System.out.println(bDto.toString());
						System.out.println(Line.sLine(100));
					}
				} catch (Exception e) {
					System.out.println("고객번호는 정수를 입력하세요");
					// TODO: handle exception
				}

			}

		}

		// TODO Auto-generated method stub

	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub

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
