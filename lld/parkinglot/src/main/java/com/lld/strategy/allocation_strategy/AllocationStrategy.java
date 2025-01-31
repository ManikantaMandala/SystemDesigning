package com.lld.strategy.allocation_strategy;

import com.lld.model.Slot;

public interface AllocationStrategy {
	Slot getAvailableSlot(String vehicleNumber);
}
