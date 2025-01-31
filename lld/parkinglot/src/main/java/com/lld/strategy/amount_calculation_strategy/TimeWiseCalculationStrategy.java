package com.lld.strategy.amount_calculation_strategy;

import java.time.Duration;
import java.time.LocalDateTime;

import com.lld.model.Slot;

public class TimeWiseCalculationStrategy implements AmountCalculationStrategy {

    public TimeWiseCalculationStrategy(){}

    @Override
    public double calculateAmount(Slot slot, LocalDateTime entryTime, LocalDateTime exitTime) {
        long durationInHours = Duration.between(entryTime, exitTime).toHours();

        if (durationInHours < 1) {
            return durationInHours * 10;
        } else if (durationInHours >= 1) {
            return durationInHours * 20;
        } else {
            return durationInHours * 30;
        }
    }

}
