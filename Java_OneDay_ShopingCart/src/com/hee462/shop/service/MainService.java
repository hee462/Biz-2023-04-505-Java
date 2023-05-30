package com.hee462.shop.service;

import java.util.Scanner;

import com.hee462.shop.service.impl.BuyerServiceImplV1;
import com.hee462.shop.service.impl.ListServiceImplV1;
import com.hee462.shop.service.impl.ProductServiceImplv1;
import com.hee462.shop.utils.Line;

public class MainService {

	protected static BuyerService bService;
	protected static ProductService pService;
	protected static ListService lService;
	protected static Scanner scan;

	public MainService() {
		bService = new BuyerServiceImplV1();
		pService = new ProductServiceImplv1();
		lService = new ListServiceImplV1();
		
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	public static void mainPrint() {
		while (true) {

			System.out.println(Line.dLine(100));
			System.out.println("빛나라 쇼핑몰 2023");
			System.out.println(Line.dLine(100));
			System.out.println("상품관리");
			System.out.println(Line.sLine(100));
			System.out.println("1.상품리스트");
			System.out.println("2.상품등록 및 수정");
			System.out.println(Line.sLine(100));
			System.out.println("고객관리");
			System.out.println(Line.sLine(100));
			System.out.println("3.고객리스트");
			System.out.println("4.고객등록 및 수정");
			System.out.println(Line.sLine(100));
			System.out.println("상품판매");
			System.out.println(Line.sLine(100));
			System.out.println("5.장바구니 상품담기");
			System.out.println("6.구매자별 장바구니 리스트 보기");
			System.out.println("7.장바구니 전체 리스트 보기");
			System.out.println(Line.sLine(100));
			System.out.println("QUIT >> 입력시 종료");
			System.out.println(Line.dLine(100));

			System.out.println("선택 >>  ");
			String str = scan.nextLine();
			if (str.equals("1")) {
				pService.selectAll();
			} else if (str.equals("2")) {
				pService.insert();
			} else if (str.equals("3")) {
				bService.selectbuyerAll();
			} else if (str.equals("4")) {
				bService.insert();
			}else if(str.equals("5")) {
				lService.selectProList();
			}else if(str.equals("6")) {
				lService.selectBuyerList();
			}else if(str.equals("7")) {
				lService.selectAllList();
			} else if (str.equals("QUIT")) {
				System.out.println(("종료합니다."));
				return;
			} else {
				System.out.println(("업무선택은 1 ~ 7 까지 중에 선택하세요"));
				continue;

			}

		}
	}
}
