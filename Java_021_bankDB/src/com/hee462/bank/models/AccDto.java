package com.hee462.bank.models;
/*
 * 데이터 클래스는 각 method간에 데이터를 묶음으로 
 * 담아 전달하기 위한 목적의 객체
 */
public class AccDto {
	
	public String acNum;
	public String acDiv;
	public String acBuId;
	public int acBanlance;
	// super ,기본 생성자
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	//field 생성자, 임의 생성자
	public AccDto(String acNum, String acDiv, String acBuId, int acBanlance) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.acBuId = acBuId;
		this.acBanlance = acBanlance;
	}
	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", acBuId=" + acBuId + ", acBanlance=" + acBanlance
				+ "]";
	}

	
	
}
