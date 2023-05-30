package com.hee462.shop.models;

public class BuyerDto {
	public String buId;
	public String buName;
	public String buTel;
	public String buAddr;
	@Override
	public String toString() {
		return "BuyerDto [buId=" + buId + ", buName=" + buName + ", buTel=" + buTel + ", buAddr=" + buAddr + "]";
	}
	public BuyerDto(String buId, String buName, String buTel, String buAddr) {
		super();
		this.buId = buId;
		this.buName = buName;
		this.buTel = buTel;
		this.buAddr = buAddr;
	}
	public BuyerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
