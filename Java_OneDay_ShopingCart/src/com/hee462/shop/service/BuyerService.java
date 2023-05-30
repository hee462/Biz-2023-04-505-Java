package com.hee462.shop.service;

import java.util.List;

import com.hee462.shop.models.BuyerDto;

public interface BuyerService {
	
	public void selectbuyerAll();
	public  void findById(String buId);
	public void insert();
	public void update(BuyerDto dto);
	
	
}
