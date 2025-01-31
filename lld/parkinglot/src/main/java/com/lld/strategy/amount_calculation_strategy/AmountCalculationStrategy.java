package com.lld.strategy.amount_calculation_strategy;

import java.time.LocalDateTime;

import com.lld.model.Slot;

public interface AmountCalculationStrategy {
    double calculateAmount(Slot slot, LocalDateTime entryTime, LocalDateTime exitTime);

}
