package com.hee462.shop.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hee462.shop.models.BuyerDto;
import com.hee462.shop.models.ProductDto;

public interface ShopingDao2 {
	@Select(" SELECT * FROM tbl_product")
	public List<ProductDto> selectAll();
	
	@Select(" SELECT * FROM tbl_product WHERE pName = #{pName} ")
	public ProductDto findByName(String pName);
	
	@Insert( ShopingSQL.PRODUCT_INSERT)
	public int insert(ProductDto dto);
	
	@Update( ShopingSQL.PRODUCT_UPDATE)
	public int update(ProductDto dto);
	
	@Select(" SELECT * FROM tbl_buyers")
	public List<BuyerDto> selectBuyerAll();
	
	@Select(" SELECT * FROM tbl_buyers WHERE buName = #{buName} ")
	public BuyerDto findByerName(String buName);
	
	@Insert( ShopingSQL.BUYERS_INSERT)
	public int insertBuyer(BuyerDto dto);
	
	@Update( ShopingSQL.BUYERS_UPDATE)
	public int updateBuyer(BuyerDto dto);
	
	
	
	
}
