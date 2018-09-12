package com.lms.integration.service;

import java.util.*;

import com.lms.integration.domain.*;
import com.lms.integration.mapper.*;

public class ShopServiceImpl implements ShopService {

	private ShopMapper shopMapper;
	
	@Override
	public List<Shop> getActiveShopListByMallId(Integer mallId) {
		// TODO Auto-generated method stub
		List<Shop> shopList = shopMapper.getActiveShopByMallId(mallId);
		if (shopList == null) {
			shopList = new ArrayList<Shop>();
		}
		return shopList;
	}
	
	public void setShopMapper(ShopMapper shopMapper) {
		
		this.shopMapper = shopMapper;
	}
	
	public ShopMapper getShopMapper() {
		
		return this.shopMapper;
	}

}
