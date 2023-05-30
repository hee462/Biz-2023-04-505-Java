package com.hee462.shop.models;

public class ListDto {
	public String ioSEQ;
	public String ioDate;
	public String ioTime;
	public String ioBuId;
	public String ioPCode;
	public int ioQuan;
	public int ioPrice;
	@Override
	public String toString() {
		return "ListDto [ioSEQ=" + ioSEQ + ", ioDate=" + ioDate + ", ioTime=" + ioTime + ", ioBuId=" + ioBuId
				+ ", ioPCode=" + ioPCode + ", ioQuan=" + ioQuan + ", ioPrice=" + ioPrice + "]";
	}
	public ListDto(String ioSEQ, String ioDate, String ioTime, String ioBuId, String ioPCode, int ioQuan, int ioPrice) {
		super();
		this.ioSEQ = ioSEQ;
		this.ioDate = ioDate;
		this.ioTime = ioTime;
		this.ioBuId = ioBuId;
		this.ioPCode = ioPCode;
		this.ioQuan = ioQuan;
		this.ioPrice = ioPrice;
	}
	public ListDto() {
		super();
		// TODO Auto-generated constructor stub
	}


}
