package com.lms.integration.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lms.integration.domain.Shop;

public interface ShopMapper {
	
	@Select("SELECT shop_id AS shopId, name_lang1 AS shopNameE, name_lang2 AS shopNameS, name_lang3 AS shopNameT, shop_no AS shopNo, '' AS errorMessage"
			+ " FROM shop WHERE mall_id = #{mallId} AND status = 'A'")
	List<Shop> getActiveShopByMallId(@Param("mallId")Integer mallId);
			
}
