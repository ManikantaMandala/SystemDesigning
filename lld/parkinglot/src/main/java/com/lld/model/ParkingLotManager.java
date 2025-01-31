package com.lld.model;

import com.lld.repository.FloorRepository;
import com.lld.repository.GateRepository;
import com.lld.repository.OperatorRepository;

public class ParkingLotManager {
    static ParkingLotManager instance;
    private int noOfFloors;
    private int noOfSlots;

    private ParkingLotManager(int noOfFloors, int noOfSlots) {
        this.noOfFloors = noOfFloors;
        this.noOfSlots = noOfSlots;
    }

    public static ParkingLotManager getInstance(int noOfFloors, int noOfSlots){
        if(instance == null){
            return new ParkingLotManager(noOfFloors, noOfSlots);
        }
        return instance;
    } 

    public void fillValues() {
        GateRepository gateRepository = GateRepository.getInstance();
        FloorRepository floorRepository = FloorRepository.getInstance();
        OperatorRepository oRepository = OperatorRepository.getInstance();

        for (int i = 0; i < noOfFloors; i++) {
            Operator entryOperator = new Operator();
            Operator exitOperator = new Operator();
            Floor floor = new Floor(noOfSlots, i, entryOperator, exitOperator);

            oRepository.addOperator(entryOperator);
            oRepository.addOperator(exitOperator);
            gateRepository.addGate(floor.getEntryGate());
            gateRepository.addGate(floor.getEntryGate());
            floorRepository.addFloor(floor);
        }
    }
}
