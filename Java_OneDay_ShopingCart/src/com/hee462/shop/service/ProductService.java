package com.hee462.shop.service;

public interface ProductService {
	// 리스트 보여주기
	public void selectAll();
	// 등록
	public void  insert();
	// 수정
	public void update();
	// 품목찾기
	public void findByName();
}
