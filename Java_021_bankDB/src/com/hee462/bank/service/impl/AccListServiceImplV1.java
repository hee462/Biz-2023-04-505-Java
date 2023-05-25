package com.hee462.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hee462.bank.config.DBConnection;
import com.hee462.bank.models.AccListDto;
import com.hee462.bank.service.AccListService;

public class AccListServiceImplV1 implements AccListService{
	protected final Connection dbConn;
	public AccListServiceImplV1() {
		dbConn = DBConnection.getDBConn();
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<AccListDto> selecAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public AccListDto findById(long seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int insert(AccListDto dto) {
		String sql = " INSERT INTO tbl_accList "
				+ " (aioSEQ, acNum, aioDate, aioTime, aioDiv, aioInput, aioOutput) "
				+ " VALUES "
				+ " (seq_accList.NEXTVAL,?,?,?,?,?,?) "; 
		// 계좌번호 거래일자 거래시각 거래구분(1 입금2 출금) 입금액 출금액
		
			try {
				PreparedStatement pStr = dbConn.prepareStatement(sql);
				pStr.setString(1, dto.acNum);
				pStr.setString(2, dto.aioDate);
				pStr.setString(3, dto.aioTime);
				pStr.setString(4, dto.aioDiv);
				pStr.setInt(5, dto.aioInput);
				pStr.setInt(6, dto.aioOutput);
				int result = pStr.executeUpdate();
				return result;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return 0;
	}
	
	@Override
	public List<AccListDto> findByDateDestance(String sDate, String eDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<AccListDto> findByAcNum(String acNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<AccListDto> findByAcNumAndDateDest(String acNum, String sDate, String eDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void update(AccListDto dto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(long seq) {
		// TODO Auto-generated method stub
		
	}
}

	