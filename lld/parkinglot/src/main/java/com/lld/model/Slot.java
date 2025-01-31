package com.lld.model;

import com.lld.enums.VehicleType;

import com.lld.enums.SlotStatus;

public class Slot extends Base {
    public int floorNumber;
    public int slotNumber;
    public SlotStatus status;
    public VehicleType type;

    public Slot(
            int floorNumber,
            int slotNumber,
            SlotStatus status,
            VehicleType type) {
        super();

        this.type = type;
        this.status = status;
        this.slotNumber = slotNumber;
        this.floorNumber = floorNumber;
    }
}
