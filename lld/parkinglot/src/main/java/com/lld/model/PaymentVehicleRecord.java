package com.lld.model;

public class PaymentVehicleRecord extends Base {
    Payment payment;
    String vehicleNumber;
    Bill bill;

    public PaymentVehicleRecord(Payment payment, String vehicleNumber, Bill bill) {
        super();

        this.payment = payment;
        this.vehicleNumber = vehicleNumber;
        this.bill = bill;
    }
}
