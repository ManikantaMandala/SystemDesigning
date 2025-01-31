package com.lld.strategy.payment_strategy;

import com.lld.model.Bill;
import com.lld.model.Payment;

public interface PaymentStrategy {
    Payment payAmount(Bill bill);
}
