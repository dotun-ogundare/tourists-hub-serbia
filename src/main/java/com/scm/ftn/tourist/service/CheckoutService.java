package com.scm.ftn.tourist.service;

import com.scm.ftn.tourist.dto.Purchase;
import com.scm.ftn.tourist.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
