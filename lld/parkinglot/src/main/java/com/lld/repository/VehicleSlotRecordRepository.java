package com.lld.repository;

import java.util.HashMap;
import java.util.Map;

import com.lld.model.VehicleSlotRecord;

public class VehicleSlotRecordRepository {

    private Map<String, VehicleSlotRecord> map;

    public VehicleSlotRecordRepository() {
        map = new HashMap<>();
    }

    public VehicleSlotRecord addRecord(String vehicleNumber, VehicleSlotRecord record) {
        return map.put(vehicleNumber, record);
    }

    public VehicleSlotRecord deleteRecord(String vehicleNumber) {
        return map.remove(vehicleNumber);
    }

    public VehicleSlotRecord getRecord(String vehicleNumber) {
        return map.get(vehicleNumber);
    }

}
