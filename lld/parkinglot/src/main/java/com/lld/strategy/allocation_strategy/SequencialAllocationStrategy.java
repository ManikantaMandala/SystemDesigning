package com.lld.strategy.allocation_strategy;

import java.util.List;

import com.lld.model.Slot;
import com.lld.repository.FloorRepository;
import com.lld.enums.SlotStatus;
import com.lld.model.Floor;

public class SequencialAllocationStrategy implements AllocationStrategy {

	private List<Floor> floors;

	public SequencialAllocationStrategy() {
		floors = FloorRepository.getInstance().getFloors();
	}

	@Override
	public Slot getAvailableSlot(String vehicleNumber) {
		for (Floor floor : floors) {
			List<Slot> slots = floor.getSlots();

			for (Slot slot : slots) {
				if (slot.status == SlotStatus.NOT_OCCUPIED) {
					return slot;
				}
			}
		}

		return null;
	}

}
