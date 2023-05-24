package com.hee462.bank.service;

import java.util.List;

import com.hee462.bank.models.AccDto;

public interface AccService {
	// 전체 데이터를 조회하여 List<AccDto> type 를return
	public List<AccDto> selectAll();
	// id값 (보통 PK값)을 전달받아 조회를 한 후
	// PK 로 조회(SELECT)를 하면 데이터는 없거나 1개 이다
	// PK(계좌번호)를 전달받아 AccDto 를 return
	public AccDto findById(String acNum);
	
	//고객 ID를 전달받아 고객의 계좌정보 리스트를 Return
	/*
	 * PK 칼럼이 아닌 칼럼으로 SELECT를 수행했을때 결과는 0이상이다
	 * 만약 SELECT 된 결과가 1개 뿐이라는 확신이 있더라도
	 * 이 데이터는 List type 으로 취급 한다
	 * 즉 PK가 아닌 키워드를 다룰땐 List type 으로 관리한다
	 */
	
	
	// AccDto 데이터를 전달받아 insert 실행
	public int insert(AccDto dto);
	// AccDto 데이터를 전달받아 update 실행
	public int update(AccDto dto);
	// PK(계좌번호)를 전달받아 delete를 실행
	public int delete(String acNum);
	// insert(),update(),delete()는 실행결과를 int로 return
	public List<AccDto> findByBuId(String strBuId);
	// 날짜 데이터로 만든 계좌중에서 가장큰값을 차즌ㄴ method
	public String maxAcNum(String date);
}
