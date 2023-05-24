package com.hee462.bank.service.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hee462.bank.config.DBConnection;
import com.hee462.bank.config.DBContract;
import com.hee462.bank.models.BuyerDto;
import com.hee462.bank.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService{
	
	
	protected final Connection dbConn;
	
	public BuyerServiceImplV1() {
		//DB 연결을 위한 초기화된 객체를 가져오기
		dbConn = DBConnection.getDBConn();

	}
	protected BuyerDto result2Dto(ResultSet result) {
		BuyerDto buyerDto = new BuyerDto();
		try {
			buyerDto.buId = result.getString(DBContract.BUYER.BUID);
			buyerDto.buName = result.getString(DBContract.BUYER.BUNAME);
			buyerDto.buTel = result.getString(DBContract.BUYER.BUTEL);
			buyerDto.buAddr = result.getString(DBContract.BUYER.BUADDR);
			buyerDto.buBirth = result.getString(DBContract.BUYER.BUBIRTH);
			buyerDto.buJob = result.getString(DBContract.BUYER.BUJOB);
			return buyerDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<BuyerDto> selectAll() {
		
		List<BuyerDto> buyerList = new ArrayList<>();
		String sql ="SELECT "
				+ " buid,buname,butel,buaddr,bubirth,bujob"
				+ " FROM tbl_buyer"
				+ " ORDER BY buid";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				// 위에 만든 메소드 
				BuyerDto buyerDto = result2Dto(result);
				buyerList.add(buyerDto);
			}
			return buyerList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * *******************SQL 명령문 작성 주의!!
	 * WHERE 절 명령문을 작성할때 
	 * 절대 변수와 전달값을 +연산으로 묶어서 처리하지 말것
	 * 다음과 같은 코드를 사용할 경우
	 * 만약 ID 변수에 "0001 OR 1 = 1" 과 같은 문자열이 담겨서
	 * 전달될 경우 WHERE 이 무력화 된다
	 * SQL 문이 DELETE 와 같은 명령이라면 TABLE 의 모든 데이터가 삭제되는 명려이 실행된다
	 * 		+ "WHERE buid = " +id; 
	 * ====> SQL Injection 공격이라고 한다
	 * 
	 */
	@Override
	public BuyerDto findById(String id) {
		String sql =" SELECT "
				+ " buid,buname,butel,buaddr,bubirth,bujob "
				+ " FROM tbl_buyer "
				//? 가 하나의 변수라고 생각해
				+ " WHERE buid = ? ";
				// 요렇게 작성해도 작동은 됨 SQL injection 되어 좋지않은 코드로 위코드로 작성하여 사용한다.
//				+ "WHERE buid = " +id;  
		
		try {
			
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			// ? 값을 저장해줌 ->1번째의 ?에 id값을 저장해
			pStr.setString(1,id);
			ResultSet result =pStr.executeQuery();
			if(result.next()) {
				// Dto로 바로 return
				return result2Dto(result);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int insert(BuyerDto dto) {
		String sql = "INSERT INTO tbl_buyer(buid,buname,butel)"
				+ "VALUES(?,?,?)";
		try {
			PreparedStatement pStr =dbConn.prepareStatement(sql);
			// 데이터 베이스에 데이터 추가하는것
			pStr.setString(1, dto.buId);
			pStr.setString(2, dto.buName);
			pStr.setString(3, dto.buTel);
			//sql 로 전달하는 명령대로 DB를 변경(insert) 하라는 의미
			int result =pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//0 으로 답이 나온다면 정상적으로  DB 가 추가되지 않았다는것
		return 0; 
	}

	@Override
	public int update(BuyerDto dto) {
		String sql =" UPDATE tbl_buyer "
				+ " SET buname = ?, "
				+ "    butel = ?, "
				+ "    buaddr = ?, "
				+ "    bubirth = ?, "
				+ "    bujob = ? "
				+ "WHERE buid = ?";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buBirth);
			pStr.setString(5, dto.buJob);
			// id 기준으로 업데이트 하기 위해 맨 마지막
			pStr.setString(6, dto.buId);
			return pStr.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int delete(String id) {
		String sql = "DELETE FROM tbl_buyer"
					+"WHERE buid = ?";
		try {
			PreparedStatement pst = dbConn.prepareStatement(sql);
			pst.setString(1, id);
			int result = pst.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
