package com.lld.strategy.payment_strategy;

import com.lld.enums.PaymentStatus;
import com.lld.enums.PaymentType;
import com.lld.model.Bill;
import com.lld.model.Payment;

public class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public Payment payAmount(Bill bill) {
        System.out.println("Payment is done successfully online!");
        System.out.println("Paid ₹" + bill.getPrice());
        return new Payment(bill, PaymentStatus.COMPLETED, PaymentType.CASH);
    }

}
