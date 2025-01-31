package com.lld.model;

import com.lld.enums.VehicleType;

public class Vehicle extends Base {
    String vehicleNumber;
    VehicleType type;

    public Vehicle(String vehicleNumber, VehicleType type) {
        super();
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }
}
