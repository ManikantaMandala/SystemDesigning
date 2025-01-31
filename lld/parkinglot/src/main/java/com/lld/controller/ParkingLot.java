package com.lld.controller;

import java.util.Scanner;

import com.lld.enums.VehicleType;
import com.lld.service.ParkingLotService;
import com.lld.strategy.allocation_strategy.AllocationStrategy;
import com.lld.strategy.allocation_strategy.SequencialAllocationStrategy;
import com.lld.strategy.amount_calculation_strategy.AmountCalculationStrategy;
import com.lld.strategy.amount_calculation_strategy.TimeWiseCalculationStrategy;

public class ParkingLot {

	public static ParkingLot instance;
	private Scanner sc;

	ParkingLotService service;

	private ParkingLot() {
		AllocationStrategy aStrategy = setAllocationStrategy();
		AmountCalculationStrategy aCStrategy = setAmountCalculationStrategy();
		sc = new Scanner(System.in);

		service = new ParkingLotService(aStrategy, aCStrategy);
	}

	public AllocationStrategy setAllocationStrategy() {
		return new SequencialAllocationStrategy();
	}

	public AmountCalculationStrategy setAmountCalculationStrategy(){
		return new TimeWiseCalculationStrategy();
	}

	public static ParkingLot getInstance() {
		if (instance == null) {
			instance = new ParkingLot();
		}

		return instance;
	}

	public void vehicleEntry() {
		System.out.println("Get the Vehicle Number");
		String vehicleNumber = sc.nextLine();

		System.out.println("Choose the vehicle type: ");
		System.out.println("1. 2 Wheeler");
		System.out.println("or 4 Wheeler");

		int option = sc.nextInt();

		VehicleType type;

		switch (option) {
			case 1:
				type = VehicleType.TWOWHEELER;
				break;
			default:
				type = VehicleType.FOURWHEELER;
				break;
		}

		service.vehicleEntry(vehicleNumber, type);
	}

	public void vehicleExit() {
		System.out.println("Get the Vehicle Number");
		String vehicleNumber = sc.next();

		service.vehicleExit(vehicleNumber);
	}

}
