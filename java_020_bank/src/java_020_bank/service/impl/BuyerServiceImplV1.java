package java_020_bank.service.impl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java_020_bank.model.BuyerDto;
import java_020_bank.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService {
	protected List <BuyerDto> buList;
	BuyerDto bDto = new BuyerDto();

	public BuyerServiceImplV1() {
		buList = new ArrayList();
	}

	@Override
	public void loadBuyer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printBuyerList() {
		// TODO Auto-generated method stub

	}

	@Override
	public BuyerDto gerBuyer(String buId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public void inputBuyer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("=".repeat(60));
		System.out.println("고객 정보 등록합니다.");
		System.out.println("-".repeat(60));
		String byId;
		// 전체적인 입력 반복을 위한 while
		while (true) {
			System.out.println("고객 ID를 입력하세요");
			byId = scan.nextLine();
			if(byId.equals("QUIT")) break;
			try {
				int intId = Integer.valueOf(byId);
				byId = String.format("%04d", intId);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}
		}
		
		System.out.println("고객 이름을 입력하세요");
		String byName = scan.nextLine();
		System.out.println("고객 전화번호를 입력하세요");
		String byTel = scan.nextLine();
		System.out.println("고객 주소를 입력하세요");
		String byAddr = scan.nextLine();
		System.out.println("고객 생년월일을 입력하세요");
		String byBirth = scan.nextLine();
		System.out.println("고객 직업을 입력하세요");
		String byJob = scan.nextLine();

		bDto.buId = byId;
		bDto.buName = byName;
		bDto.buTel = byTel;
		bDto.buAddr = byAddr;
		bDto.buBirth = byBirth;
		bDto.buJob = byJob;
		buList.add(bDto);

		for (BuyerDto bDto : buList) {
			if (bDto.buId.equals(byId)) {
				System.out.println("-".repeat(60));
				System.out.println("동일한 Id가 있습니다. 데이터를 수정하세요");
				System.out.println(bDto.toString());
				System.out.println("-".repeat(60));
			}
		}
	}

	@Override
	public void printBuyerList(PrintWriter out) {
		// TODO Auto-generated method stub
		
	}

}
	
