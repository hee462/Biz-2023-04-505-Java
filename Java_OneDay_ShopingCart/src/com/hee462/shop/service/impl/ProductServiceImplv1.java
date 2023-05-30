package com.hee462.shop.service.impl;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.hee462.shop.config.DBConnection;
import com.hee462.shop.mappers.ShopingDao;

import com.hee462.shop.models.ProductDto;
import com.hee462.shop.service.ProductService;
import com.hee462.shop.utils.Line;

public class ProductServiceImplv1 implements ProductService {

	protected static SqlSession sqlSession;
	protected static ShopingDao sDao;
	ProductDto pDto = new ProductDto();
	protected static Scanner scan;
	protected List<ProductDto> pList;

	public ProductServiceImplv1() {
		sqlSession = DBConnection.getFactory().openSession(true);
		sDao = sqlSession.getMapper(ShopingDao.class);
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void selectAll() {
		System.out.println(Line.dLine(100));
		System.out.println("상품 리스트");
		System.out.println(Line.dLine(100));
		pList = sDao.selectAll();
		for (ProductDto pDto : pList) {
			System.out.println(pDto.pCode);
			System.out.println(pDto.pName);
			System.out.println(pDto.pIitem);
			System.out.println(pDto.pIPrice);
			System.out.println(pDto.pOPrice);
		}
	}
	@Override
	public void insert() {
		System.out.println("상품 등록");
		System.out.println(Line.dLine(100));
		String strCode = "";
		try {
			System.out.println("상품 코드  >>");
			strCode = scan.nextLine();
			if (strCode.equals(pDto.pCode)) {
				update();
			}
		} catch (Exception e) {
			System.out.println(" 정수로만 입력하세요");
		}

		System.out.println("상품 이름  >>");
		String strName = scan.nextLine();

		System.out.println("상품 품목  >>");
		String strItem = scan.nextLine();

		System.out.println("매입단가  >>");
		int strIPrice = Integer.valueOf(scan.nextLine());

		System.out.println("매출단가  >>");
		int strOPrice = (int) (strIPrice + (strIPrice * 0.22));
		System.out.println(strOPrice);

		pDto.pCode = strCode;
		pDto.pName = strName;
		pDto.pIitem = strItem;
		pDto.pIPrice = strIPrice;
		pDto.pOPrice = strOPrice;

		int result = sDao.insert(pDto);
		if (result > 0) {
			System.out.println("상품등록 완료");
		} else {
			System.out.println("상품등록 실패");
		}

		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		while (true) {
			System.out.println("수정할 상품코드를 입력하세요");
			System.out.println("상품코드  >> ");
			String strName = scan.nextLine();
			pDto = sDao.findByName(strName);
			if (pDto == null) {
				System.out.println("일치하는 상품코드가 없습니다");
			}
			System.out.printf("상품명 %s\n : ", pDto.pName);
			String strPName= scan.nextLine();
			if(!strPName.equals("")) pDto.pName = strPName;
			
			System.out.printf("상품품목 %s\n : ", pDto.pIitem);
			String strItem= scan.nextLine();
			if(!strItem.equals("")) pDto.pIitem = strItem;
			
			
			System.out.printf("매입단가 %s\n : ", pDto.pIPrice);
			int strPrice= Integer.valueOf(scan.nextLine());
			
			System.out.printf("매출단가 %s\n : ", pDto.pOPrice);
			int strOPrice = (int) (strPrice + (strPrice * 0.22)); 
			System.out.println(strOPrice);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void findByName() {
		System.out.println("검색 할 상품명를 입력해주세요");
		System.out.println(" 상품명  >> ");
		String strName = scan.nextLine();
		pDto = sDao.findByName(strName);
		if (pDto == null) {
			System.out.println(" 상품코드가 일치하지 않습니다");
		} else {
			System.out.println(Line.dLine(100));
			System.out.printf("상품명 %s\n : ", pDto.pName);
			System.out.printf("상품품목 %s\n : ", pDto.pIitem);
			System.out.printf("매입단가 %s\n : ", pDto.pIPrice);
			System.out.printf("매출단가 %s\n : ", pDto.pOPrice);

		}
		// TODO Auto-generated method stub

	}

}
