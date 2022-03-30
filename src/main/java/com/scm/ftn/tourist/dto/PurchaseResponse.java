package com.scm.ftn.tourist.dto;
//will be used to send back java object as json

import lombok.Data;
import lombok.NonNull;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;
}
