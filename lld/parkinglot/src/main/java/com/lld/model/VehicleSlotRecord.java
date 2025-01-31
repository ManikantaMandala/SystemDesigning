package com.lld.model;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @param vehicleNumber String
 * @param slot          Slot
 * @param entryTime     LocalDateTime
 *
 * @return VehicleSlotRecord
 *
 */
public class VehicleSlotRecord extends Base {
    String vehicleNumber;
    Slot slot;
    LocalDateTime entryTime;

    public VehicleSlotRecord(String vehicleNumber, Slot slot) {
        super();

        this.vehicleNumber = vehicleNumber;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Slot getSlot() {
        return slot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

}
