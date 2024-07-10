package com.scaler.bookmyshowjuly24.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public enum PaymentMode {
    UPI,
    CREDIT_CARD,
    DEBIT_CARD,
    NET_BANKING,
}
