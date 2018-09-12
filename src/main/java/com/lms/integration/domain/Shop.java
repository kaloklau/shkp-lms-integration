package com.lms.integration.domain;

import java.io.Serializable;

public class Shop implements Serializable {

    private Integer shopId;
    private String shopNameE;
    private String shopNameS;
    private String shopNameT;
    private String shopNo;
    private String errorMessage;

    public Shop() {
        super();
    }

    public Shop(Integer shopId, String shopNameE, String shopNameS, String shopNameT, String shopNo, String errorMessage) {
        this.shopId = shopId;
        this.shopNameE = shopNameE;
        this.shopNameS = shopNameS;
        this.shopNameT = shopNameT;
        this.shopNo = shopNo;
        this.errorMessage = errorMessage;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopNameE() {
        return shopNameE;
    }

    public void setShopNameE(String shopNameE) {
        this.shopNameE = shopNameE;
    }

    public String getShopNameS() {
        return shopNameS;
    }

    public void setShopNameS(String shopNameS) {
        this.shopNameS = shopNameS;
    }

    public String getShopNameT() {
        return shopNameT;
    }

    public void setShopNameT(String shopNameT) {
        this.shopNameT = shopNameT;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

