package com.lms.integration.endpoint;

import java.util.ArrayList;
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
	private String secretKey;
    private ShopService shopService;

    public Message<?> list(Message<String> msg) {
    	
    	Integer mallId = Integer.valueOf(msg.getPayload());
    	String apiKey = (String)msg.getHeaders().get("apiKey");
    	
    	if (apiKey != null && !apiKey.isEmpty() && apiKey.equals(secretKey)) {
    		    	    
    		List<Shop> shopList = shopService.getActiveShopListByMallId(mallId);
    	    	  		
    		ShopList result = new ShopList(shopList);
    		return MessageBuilder.withPayload(result)
    				.copyHeadersIfAbsent(msg.getHeaders())
    				.setHeader(STATUSCODE_HEADER, HttpStatus.OK)
    				.build();
    	}
    	else {
    		List<Shop> errorShopList = new ArrayList<Shop>();
    		errorShopList.add(new Shop(-1, "", "", "", "", "Mis-match found in api-key."));
    		ShopList errorResult = new ShopList(errorShopList);
    		return MessageBuilder.withPayload(errorResult)
        			.copyHeadersIfAbsent(msg.getHeaders())
        			.setHeader(STATUSCODE_HEADER, HttpStatus.OK)
        			.build();
    	}
    }
    
    public void setShopService(ShopService shopService) {
    	this.shopService = shopService;
    }
    
    public ShopService getShopService() {
    	return shopService;
    }
    
    public void setSecretKey(String secretKey) {
    	this.secretKey = secretKey;
    }
    
    
}
