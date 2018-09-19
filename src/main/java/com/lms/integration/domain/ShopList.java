package com.lms.integration.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShopList implements Serializable {

    private List<Shop> shopInfo;

    public ShopList(List<Shop> shopInfo) {
    	
    	this.shopInfo = shopInfo;
    }
    
    public List<Shop> getShopInfo() {

        if (shopInfo == null) {
            shopInfo = new ArrayList<>();
        }
        return shopInfo;
    }
    
    public void setShopInfo(List<Shop> shopInfo) {
    	this.shopInfo = shopInfo;
    }
}
