package com.hee462.shop.service;

import java.util.List;

import com.hee462.shop.models.BuyerDto;
import com.hee462.shop.models.ProductDto;

public interface ListService {
	// 전체
	public void selectAllList();
	//날짜
	public void selectDateList();
	//고객별
	public List<BuyerDto> selectBuyerList();
	//상품별
	public List<ProductDto> selectProList();
	//고객+상품
	public void selectBPList();
	
}
