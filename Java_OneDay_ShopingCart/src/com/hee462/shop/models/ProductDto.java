package com.hee462.shop.models;

public class ProductDto {
	public String pCode;
	public String pName;
	public String pIitem;
	public int pIPrice;
	public int pOPrice;
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(String pCode, String pName, String pIitem, int pIPrice, int pOPrice) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pIitem = pIitem;
		this.pIPrice = pIPrice;
		this.pOPrice = pOPrice;
	}
	@Override
	public String toString() {
		return "ProductDto [pCode=" + pCode + ", pName=" + pName + ", pIitem=" + pIitem + ", pIPrice=" + pIPrice
				+ ", pOPrice=" + pOPrice + "]";
	}
	


}
