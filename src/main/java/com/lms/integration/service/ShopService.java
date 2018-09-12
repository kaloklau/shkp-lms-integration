package com.lms.integration.service;

import com.lms.integration.domain.Shop;
import java.util.List;

public interface ShopService {

    List<Shop> getActiveShopListByMallId(Integer mallId);
}
