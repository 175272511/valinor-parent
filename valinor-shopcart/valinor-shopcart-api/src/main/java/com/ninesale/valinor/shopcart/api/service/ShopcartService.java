package com.ninesale.valinor.shopcart.api.service;

import com.ninesale.valinor.shopcart.api.model.DubboShopcartRequest;
import com.ninesale.valinor.shopcart.api.model.DubboShopcartResponse;;

public interface ShopcartService {
	DubboShopcartResponse addOrder(DubboShopcartRequest request);
}
