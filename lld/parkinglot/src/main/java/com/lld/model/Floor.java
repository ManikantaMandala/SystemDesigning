package com.lld.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.lld.enums.GateType;
import com.lld.enums.SlotStatus;
import com.lld.enums.VehicleType;

public class Floor extends Base {
    private int floorNumber;

    private List<Slot> slots;

    private Gate entryGate;
    private Gate exitGate;

    public Floor(int noOfSlots, int floorNumber, Operator entryOperator, Operator exitOperator) {
        super();

        slots = new ArrayList<>();
        addSlots(noOfSlots);

        this.floorNumber = floorNumber;
        this.entryGate = new Gate(GateType.ENTRY, entryOperator, floorNumber);
        this.exitGate = new Gate(GateType.EXIT, exitOperator, floorNumber);
    }

    public UUID getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public void addSlots(int noOfSlots) {
        for (int i = 0; i < noOfSlots; i++) {
            Slot slotTwoWheeler = new Slot(floorNumber, i, SlotStatus.NOT_OCCUPIED, VehicleType.TWOWHEELER);
            Slot slotFourWheeler = new Slot(floorNumber, noOfSlots + i, SlotStatus.NOT_OCCUPIED, VehicleType.FOURWHEELER);

            slots.add(slotTwoWheeler);
            slots.add(slotFourWheeler);
        }
    }
}
