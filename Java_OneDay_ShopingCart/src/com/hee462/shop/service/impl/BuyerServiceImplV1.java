package com.hee462.shop.service.impl;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.hee462.shop.config.DBConnection;
import com.hee462.shop.mappers.ShopingDao;
import com.hee462.shop.models.BuyerDto;
import com.hee462.shop.service.BuyerService;
import com.hee462.shop.utils.Line;

public class BuyerServiceImplV1 implements BuyerService{
	
	SqlSession sqlSession = DBConnection.getFactory().openSession(true);
	BuyerDto bDto = new BuyerDto();
	ShopingDao sDao = sqlSession.getMapper(ShopingDao.class);
	protected final Scanner scan;
	protected List<BuyerDto> bList;
	
	
	public BuyerServiceImplV1() {
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selectbuyerAll() {
		System.out.println(Line.dLine(100));
		System.out.println("고객 리스트");
		System.out.println(Line.dLine(100));
		bList = sDao.selectBuyerAll();
		for(BuyerDto bDto : bList) {
			System.out.println(bDto.buId);
			System.out.println(bDto.buName);
			System.out.println(bDto.buTel);
			System.out.println(bDto.buAddr);
		}
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void findById(String buName) {
		System.out.println(Line.dLine(100));
		System.out.println("조회 할 고객명를 입력하세요");
		System.out.println("고객 ID  >> ");
		String strName = scan.nextLine();
		bDto = sDao.findByerName(strName);
		if(bDto == null) {
			System.out.println("일치하는 고객ID가 없습니다");
		}else {
			System.out.println(Line.dLine(100));
			System.out.printf("고객명 %s\n : " ,bDto.buName);
			System.out.printf("전화번호 %s\n : " ,bDto.buTel);
			System.out.printf("주소 %s\n : " ,bDto.buAddr);
		}
		
		
	}

	@Override
	public void insert() {
		System.out.println(Line.dLine(100));
		System.out.println("고객 정보 등록");
		System.out.println(Line.dLine(100));
		System.out.println(" 고객명을 입력하세요");
		String strName = scan.nextLine();
		System.out.println(" 전화번호를 입력하세요");
		String strTel = scan.nextLine();
		System.out.println(" 주소를 입력하세요");
		String strAddr = scan.nextLine();
		bDto.buName = strName;
		bDto.buTel = strTel;
		bDto.buAddr = strAddr;
		int result = sDao.insertBuyer(bDto);
		if(result > 0) {
			System.out.println("고객 등록 성공");
		}else {
			System.out.println("고객 등록 실패");
		}
		
		
		
	}

	public void update(BuyerDto dto) {
		while(true) {
			System.out.println("수정할 고객ID를 입력해주세요");
			System.out.println("고객명 >> ");
			String strName = scan.nextLine();
			bDto = sDao.findByerName(strName);
			if(bDto == null) {
				System.out.println("일치하는 고객ID가 없습니다");
			}
			System.out.printf("고객명 : %s\n" , bDto.buName);
			String strCId = scan.nextLine();
			if(!strCId.equals("")) bDto.buName = strCId;
			
			System.out.printf("전화번호 : %s\n" , bDto.buTel);
			String strCTel = scan.nextLine();
			if(!strCTel.equals("")) bDto.buTel = strCTel;
			
			System.out.printf("주소 : %s\n" , bDto.buAddr);
			String strCAddr = scan.nextLine();
			if(!strCAddr.equals("")) bDto.buAddr = strCAddr;
			int result = sDao.updateBuyer(bDto);
			if(result > 0) {
				System.out.println(" 고객 정보 수정 완료");
			} else {
				System.out.println(" 고객 정보 수정 실패");
			}
			// TODO Auto-generated method stub
			
		}
		}


}
