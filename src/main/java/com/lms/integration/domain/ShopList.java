package com.lms.integration.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShopList implements Serializable {

    private List<Shop> shop;

    public ShopList(List<Shop> shop) {
    	
    	this.shop = shop;
    }
    
    public List<Shop> getShop() {

        if (shop == null) {
            shop = new ArrayList<>();
        }
        return shop;
    }
    
    public void setShop(List<Shop> shop) {
    	this.shop = shop;
    }
}
