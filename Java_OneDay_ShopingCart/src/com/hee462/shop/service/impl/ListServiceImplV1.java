package com.hee462.shop.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.hee462.shop.config.DBConnection;
import com.hee462.shop.mappers.ShopingDao;
import com.hee462.shop.models.BuyerDto;
import com.hee462.shop.models.ListDto;
import com.hee462.shop.models.ProductDto;
import com.hee462.shop.service.BuyerService;
import com.hee462.shop.service.ListService;
import com.hee462.shop.service.ProductService;
import com.hee462.shop.utils.Line;

public class ListServiceImplV1 implements ListService {

	SqlSession sqlSession = DBConnection.getFactory().openSession(true);
	BuyerDto bDto = new BuyerDto();
	ProductDto pDto = new ProductDto();
	ShopingDao sDao = sqlSession.getMapper(ShopingDao.class);
	Scanner scan;
	List<BuyerDto> bList;
	List<ProductDto> pList;
	List<ListDto> lList;
	protected static ProductService pService;
	protected static BuyerService bService;
	
	public ListServiceImplV1() {
		scan = new Scanner(System.in);
		bService = new BuyerServiceImplV1();
		pService = new ProductServiceImplv1();
		// TODO Auto-generated constructor stub
	}
	protected String getTodayDate() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);
		return todayString;
	}
	protected String getTodayTime() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat timeFormat  = new SimpleDateFormat("HH:mm:ss");
		String timeString  = timeFormat.format(date);
		return timeString;
	}

	@Override
	public void selectAllList() {
		System.out.println(Line.dLine(100));
		System.out.println("상품판매 리스트");
		System.out.println(Line.dLine(100));
		System.out.println("거래일자 \t거래시각\t 고객ID\t고객이름\t "
				+ "전화번호\t 상품코드\t 상품명\t 판매단가\t 수량\t 판매합계\n");
		System.out.println(Line.sLine(100));
		System.out.print(getTodayDate() + "\t");
		System.out.print(getTodayTime() + "\t");
		for(ListDto lDto : lList) {
			BuyerDto bDto = bService.selectbuyerAll();
			
	}

	@Override
	public void selectDateList() {
		System.out.println("기간을 입력해주세요 >>");
		String str = scan.nextLine();

		// TODO Auto-generated method stub

	}

	@Override
	public List<BuyerDto> selectBuyerList() {
		System.out.println("고객명을 입력해주세요 >>");
		String str = scan.nextLine();
		bDto = sDao.findByerName(str);
		bList.add(bDto);
		return bList;
		}
	@Override
	public List<ProductDto> selectProList() {
		System.out.println("상품명을 입력해주세요 >>");
		String str = scan.nextLine();
		pDto = sDao.findByName(str);
		pList.add(pDto);
		return pList;
	}
	@Override
	public void selectBPList() {
		System.out.println("고객 +상품을 입력해주세요 >>");
		String str = scan.nextLine();
	}

}
