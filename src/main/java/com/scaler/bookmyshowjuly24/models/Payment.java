package com.scaler.bookmyshowjuly24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {
    private int amount;
    private String referenceNumber;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
}
