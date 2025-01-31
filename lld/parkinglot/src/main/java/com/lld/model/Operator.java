package com.lld.model;

import java.util.UUID;

public class Operator extends Base {
    static int operatorNumber = 1;
    String name;

    public Operator() {
        super();
        this.name = "Operator" + operatorNumber++;
    }

    public UUID getId() {
        return id;
    }

    public static int getOperatorNumber() {
        return operatorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
