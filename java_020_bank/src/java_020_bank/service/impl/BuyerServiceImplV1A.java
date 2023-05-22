package java_020_bank.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java_020_bank.model.BuyerDto;
import java_020_bank.model.utils.Index;
import java_020_bank.model.utils.Line;
import java_020_bank.model.utils.config;
import java_020_bank.service.BuyerService;

public class BuyerServiceImplV1A implements BuyerService {

	Scanner scan;
	protected List<BuyerDto> buList;
	// null 값으로 임시clear
	

	public BuyerServiceImplV1A() {
		buList = new ArrayList();
		scan = new Scanner(System.in);
	}

	@Override
	public void loadBuyer() {
		InputStream is = null;
		Scanner scan =null;
		try {
			is = new FileInputStream(config.BUYER_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] buyer = line.split("\t");
			try {
				BuyerDto bDto = new BuyerDto();
				bDto.buId = buyer[Index.BUYER.BU_ID];
				bDto.buName = buyer[Index.BUYER.BU_NAME];
				bDto.buTel = buyer[Index.BUYER.BU_TEL];
				bDto.buAddr = buyer[Index.BUYER.BU_ADDR];
				bDto.buBirth = buyer[Index.BUYER.BU_BRITH];
				bDto.buJob = buyer[Index.BUYER.BU_JOB];
				buList.add(bDto);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	}
	/*
	 * 화면 출력을 위하여 리스트 머릿글 부준을 System.out.println() 으로 출력하고
	 * System.out 이 연결된 printWriter를 화면용으로 생성하여
	 * printBuyerLsit(PrintWriter) method에 전달하여 본문 출력
	 */
	@Override // 출력용
	public void printBuyerList() {
		OutputStream os = System.out;
		PrintWriter out = new PrintWriter(os);
		
		System.out.println(Line.dLine(100));
		System.out.println("고객 정보 리스트");
		System.out.println(Line.dLine(100));
		System.out.println(" 고객ID\t 고객명\t 전화번호\t 주소\t 생년월일\t 직업");
		
		printBuyerList(out);
		out.close();
		System.out.println(Line.dLine(100));
		// TODO Auto-generated method stub

	}

	@Override
	public BuyerDto gerBuyer(String buId) {
		// buList에 값이 없다면 loadBuyer(); 호출
		if(buList.isEmpty()) {
			loadBuyer();

		}
		// 매개변수 buId 랑 dto 안에 있는 buId 랑 같으면 dto 보내기
		for(BuyerDto dto : buList) {
			if(dto.buId.equals(buId)) {
				return dto;
			}
		}
		
		return null;
	}

	/*
	 * 현재 buyerList 에 저장된 요소들을 탐색하여 고객ID 가 가장 큰 값을 갖는 요소를 찾아서 고객ID+1 의 값을 return
	 */
	protected int getmaxId() {
		int maxId = 0;
		for (BuyerDto dto : buList) {
			int intId = Integer.valueOf(dto.buId);
			//// 가장 큰 값을 찾는 코드
			if (intId > maxId)
				maxId = intId;
		}
		return maxId + 1;
	}

	protected BuyerDto buyerItemInput() {
		// 값에 대한 검증을 하기 위한, while문

		String byId = "";
		BuyerDto bDto = null;
		while (true) {
			System.out.printf("고객 ID(%04d) >> ", getmaxId());
			String buId = scan.nextLine();
			// Q 처럼 단독 알파벳으로 사용하면 좋을것 같은데??
			// 입력하는 도중 알파벳은 실수로 자꾸 눌릴수 있어서 실수입력 확율을 줄이기 위해서 단어사용
			if (byId.equals("QUIT"))return null;
			// Enter 누르면
			if (byId.equals("")) byId = String.format("%04d", getmaxId());
			try {
				int intBuId = Integer.valueOf(byId);
				byId = String.format("%04d", intBuId);
			} catch (Exception e) {
				System.out.println(" 고객ID 는 정수로만 입력하세요");
			}
			// 여기까지 bDto 는 null 값
			for (BuyerDto dto : buList) {
				// 고객 ID에 해당하는 정보가 있으면
				// 이때부터는 buDto 는 null 인 상태가 아니고
				// 입력한 고객ID의 데이터의 주소를 갖는 상태
				if (dto.buId.equals(buId)) {
					bDto = dto;
					break;
				}
			}
			break;

		} // buId 입력 끝

		// 검증이 필요 없어서 while 안으로 넣지 않는다
		// 속성이 아니라 객체 자체를 비교하는 값
		System.out.printf("이름(%s) 종료하려면 (QUIT)>> ", bDto == null ? "신규 " : bDto.buName);
		String byName = scan.nextLine();
		if (byName.equals("QUIT"))
			return null;
		// Enter 값 입력시 기존의 값 출력
		if (byName.equals("")) {
			byName = bDto.buName;
		}
		System.out.printf("전화번호(%s) 종료하려면 (QUIT)>> ", bDto == null ? "신규 " : bDto.buTel);
		String byTel = scan.nextLine();
		if (byTel.equals("QUIT"))
			return null;
		if (byName.equals("")) {
			byTel = bDto.buTel;
		}
		System.out.printf("주소(%s) >> 종료하려면 (QUIT)", bDto == null ? "신규 " : bDto.buAddr);
		String byAddr = scan.nextLine();
		if (byAddr.equals("QUIT"))
			return null;
		if (byName.equals("")) {
			byTel = bDto.buTel;
		}
		System.out.printf("생년월일(%s) >>종료하려면 (QUIT) ", bDto == null ? "신규 " : bDto.buBirth);
		String byBirth = scan.nextLine();
		if (byBirth.equals("QUIT"))
			return null;
		if (byName.equals("")) {
			byTel = bDto.buTel;
		}
		System.out.printf("직업(%s) >> 종료하려면 (QUIT)", bDto == null ? "신규 " : bDto.buJob);
		String byJob = scan.nextLine();
		if (byJob.equals("QUIT"))
			return null;
		if (byName.equals("")) {
			byName = bDto.buName;
		}
		// 각 객체에 입력값 저장
		if (bDto == null)
			bDto = new BuyerDto();
		bDto.buId = byId;
		bDto.buName = byName;
		bDto.buTel = byTel;
		bDto.buAddr = byAddr;
		bDto.buBirth = byBirth;
		bDto.buJob = byJob;
		// 밖으로 bDto 보내기
		return bDto;
	}

	@Override

	public void inputBuyer() {

		// 입력받은 값 list 추가
		while (true) {
			System.out.println(Line.dLine(100));
			System.out.println("고객정보 관리");
			System.out.println(Line.dLine(100));
			// 입력받은 bDto 값 method 호출하여 bto에 선언
			BuyerDto bDto = buyerItemInput();
			// 리스트에 입력된게 없다면 멈추고 아니면 리스트에 추가하기
			if (bDto == null)
				break;

			/*
			 * buyerList 데이터를 추가 또는 수정 buyerList 데이터에 bDto 요소가 없으면 추가 있으면 무시 주소에 대한 개념을 이해하여
			 * 보자
			 * 
			 * List type 객체의 contains method List type 객체(buLsit) 의 요소중에 bDto 변수에 담긴 주소를 가진
			 * 요소가 있음?을 물어보는 method = contains
			 */
			// not 있음으로 담긴 주소가 있으면 List에 bDto 요소 저장
			if (!buList.contains(bDto))
				buList.add(bDto);
		}
		System.out.println("고객정보 입력 종료");
//*****************************파일에 저장하기 위해서 입력받고 파일 저장
		OutputStream os = null;
		PrintWriter out = null;
		try {
			os = new FileOutputStream(config.BUYER_FILE);
			out = new PrintWriter(os);

			printBuyerList(out);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
/*
 *  매개변수로 전달받은 PrintWriter 객체의 구분에 따라 화면에 출력하거나 파일로 출력하거나
 */
	public void printBuyerList(PrintWriter out) {
		
		for (BuyerDto dto : buList) {
			out.printf("%s\t", dto.buId);
			out.printf("%s\t", dto.buName);
			out.printf("%s\t", dto.buTel);
			out.printf("%s\t", dto.buAddr);
			out.printf("%s\t", dto.buBirth);
			out.printf("%s\n", dto.buBirth);
		}
		System.out.println(Line.dLine(100));
	}

}
