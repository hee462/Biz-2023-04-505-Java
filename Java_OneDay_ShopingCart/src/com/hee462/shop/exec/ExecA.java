package com.hee462.shop.exec;

import java.util.Scanner;

import com.hee462.shop.service.BuyerService;
import com.hee462.shop.service.ListService;
import com.hee462.shop.service.MainService;
import com.hee462.shop.service.ProductService;
import com.hee462.shop.service.impl.BuyerServiceImplV1;
import com.hee462.shop.service.impl.ListServiceImplV1;
import com.hee462.shop.service.impl.ProductServiceImplv1;

public class ExecA {
	public static void main(String[] args) {
		
		BuyerService bService = new BuyerServiceImplV1();
		ProductService pService = new ProductServiceImplv1();
		ListService lService = new ListServiceImplV1();
		Scanner scan = new Scanner(System.in);
		MainService mService = new MainService();
		
		mService.mainPrint();
		
		//bService.selectbuyerAll();
		//bService.findById("0001");
		//bService.insert();
		//bService.update(null);
		//pService.selectAll();
		
		//pService.selectAll();
		
		//pService.insert();
	     //pService.findByName();
		//pService.update();
		
		//lService.selectBuyerList();
		//lService.selectAllList();
	

		
		
	}
	
}
