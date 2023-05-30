package com.hee462.shop.mappers;

public class ShopingSQL {
	public static final String PRODUCT_INSERT =" INSERT INTO tbl_product(  "
			+ " pCode, pName, pIitem,PIPrice, POPrice) "
			+ " VALUES( "
			+ " #{pCode},#{pName},#{pIitem},#{pIPrice},#{pOPrice}) ";
	
	public static final String PRODUCT_UPDATE = " UPDATE tbl_product "
			+ " SET pName = #{pName} "
			+ " pIitem = #{pIitem}, "
			+ " PIPrice = #{PIPrice}, "
			+ " POPrice = #{POPrice} "
			+ " WHERE pCode =  #{pCode} ";
	
	public static final String BUYERS_INSERT =" INSERT INTO tbl_buyers(  "
			+ " buId, buName, buTel,buAddr) "
			+ " VALUES( "
			+ " #{buId},#{buName},#{buTel},#{buAddr}) ";
	
	public static final String BUYERS_UPDATE = " UPDATE tbl_buyers "
			+ " SET buName = #{buName} "
			+ " buTel = #{buTel}, "
			+ " buAddr = #{buAddr} "
			+ " WHERE buId =  #{buId} ";
}
