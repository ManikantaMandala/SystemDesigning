package com.lld.model;

import java.util.UUID;

import com.lld.enums.GateType;

public class Gate extends Base {
    private GateType type;
    private Operator currentOperator;
    private int floorNumber;

    public Gate(GateType type, Operator operator, int floorNumber) {
        super();
        this.type = type;
        this.currentOperator = operator;
        this.floorNumber = floorNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

}
