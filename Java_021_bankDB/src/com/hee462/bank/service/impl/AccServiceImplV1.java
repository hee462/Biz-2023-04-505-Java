package com.hee462.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hee462.bank.config.DBConnection;
import com.hee462.bank.config.DBContract;
import com.hee462.bank.models.AccDto;
import com.hee462.bank.service.AccService;

public class AccServiceImplV1 implements AccService {
	// DB에 연결하는 session 구축하는 도구
	protected final Connection dbConn;

	public AccServiceImplV1() {
		// dbConn 도구를 이미 만들어준 DBConnection
		dbConn = DBConnection.getDBConn();
	}

	/*
	 * throws ... try ... catch ... 으로 처리를 해야하는 코드가 있을 경우 직접 처리하지 않고 이 method 를 호출 한
	 * 곳으로 exception 을 대리 처리하도록 하는 조치
	 * 
	 * 
	 */
	protected AccDto result2Dto(ResultSet result) throws SQLException {
		AccDto accDto = new AccDto();
		accDto.acNum = result.getString(DBContract.ACC.ACNUM);
		accDto.acDiv = result.getString(DBContract.ACC.ACDIV);
		accDto.acBuId = result.getString(DBContract.ACC.ACBUID);
		// accDto.acBanlance = result.getString(DBContract.ACC.ACBANLANCE);
		// SELECT 된 데이터의 type이 확실하게 숫자형 인 경우 getInt() method 사용하여 직접 정수형으로 받을수 있다
		accDto.acBanlance = result.getInt(DBContract.ACC.ACBANLANCE);
		return accDto;

	}

	public List<AccDto> db2List(PreparedStatement pStr) throws SQLException {

		ResultSet result = pStr.executeQuery();
		List<AccDto> accList = new ArrayList<>();

		while (result.next()) {
			AccDto accDto = result2Dto(result);
			accList.add(accDto);
			return accList;

		}
		return accList;
	}

	@Override
	public List<AccDto> selectAll() {

		String sql = "SELECT " + " acNum,acDiv,acBuId,acBanlance" + " FROM tbl_acc" + " ORDER BY acNum";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<AccDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccDto findById(String acNum) {
		String sql = " SELECT acNum,acDiv,acBuId,avBanlance " + " FROM tbl_acc " + " WHERE acNum = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acNum);
			ResultSet result = pStr.executeQuery();
			if (result.next()) {
				return result2Dto(result);
			}
			result.close();
			pStr.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insert(AccDto dto) {
		String sql = " INSERT INTO tbl_acc " + " acNum, acDiv, acBuid, acBanlance) " + " VALUES(?,?,?,?) ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.acNum);
			pStr.setString(2, dto.acDiv);
			pStr.setString(3, dto.acBuId);
			pStr.setInt(4, dto.acBanlance);
			int result = pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public int update(AccDto dto) {

		return 0;
	}

	@Override
	public int delete(String acNum) {

		return 0;
	}

	public List<AccDto> findByBuId(String acBuID) {

		String sql = "SELECT " + " acNum,acDiv,acBuId,acBanlance" + " FROM tbl_acc" + " WHERE acBuID = ?"
				+ " ORDER BY acNum";

		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acBuID);
			List<AccDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String maxAcNum(String date) {
		String sql = "SELECT substr(max(acNum),9) " + "FROM tbl_acc " + "WHERE substr(acNum,0,8) = ? ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, date);
			ResultSet result = pStr.executeQuery();
			if (result.next()) {
				return result.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "0";
	}

}
