package com.lld.model;

import com.lld.enums.PaymentStatus;
import com.lld.enums.PaymentType;

public class Payment extends Base {
    Bill bill;
    PaymentStatus status;
    PaymentType type;

    public Payment(Bill bill, PaymentStatus status, PaymentType type) {
        super();

        this.bill = bill;
        this.status = status;
        this.type = type;
    }

}
