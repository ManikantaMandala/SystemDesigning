package com.lld.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill extends Base {
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    String vehicleNumber;
    Slot slot;
    double price;
    Operator operator;

    public Bill(
            LocalDateTime entryTime,
            LocalDateTime exitTime,
            String vehicleNumber,
            Slot slot,
            double price,
            Operator operator) {
        super();

        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicleNumber = vehicleNumber;
        this.slot = slot;
        this.price = price;
        this.operator = operator;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return String.format("+------------------------------------------------+\n" +
                "|         PARKING SLOT INFORMATION              |\n" +
                "+------------------------------------------------+\n" +
                "| Entry Time    : %-30s |\n" +
                "| Exit Time     : %-30s |\n" +
                "| Vehicle No.   : %-30s |\n" +
                "| Slot No.      : %-30s |\n" +
                "| Price         : $%-29.2f |\n" +
                "| Operator      : %-30s |\n" +
                "+------------------------------------------------+\n",
                entryTime.format(formatter),
                exitTime.format(formatter),
                vehicleNumber,
                slot.floorNumber + "F " + slot.slotNumber + "s",
                price,
                operator.getName());
    }

}
