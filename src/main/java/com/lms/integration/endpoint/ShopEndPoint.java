package com.lms.integration.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.*;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.lms.integration.domain.*;
import com.lms.integration.service.*;

public class ShopEndPoint {

	private static final String STATUSCODE_HEADER = "http_statusCode";
    private ShopService shopService;

    public Message<?> list(Message<String> msg) {
    	
    	Integer mallId = Integer.valueOf(msg.getPayload());
    	List<Shop> shopList = shopService.getActiveShopListByMallId(mallId);
    	    	  		
    	ShopList result = new ShopList(shopList);
    	return MessageBuilder.withPayload(shopList)
    			.copyHeadersIfAbsent(msg.getHeaders())
    			.setHeader(STATUSCODE_HEADER, HttpStatus.OK)
    			.build();    		           
    }
    
    public void setShopService(ShopService shopService) {
    	this.shopService = shopService;
    }
    
    public ShopService getShopService() {
    	return shopService;
    }
}
