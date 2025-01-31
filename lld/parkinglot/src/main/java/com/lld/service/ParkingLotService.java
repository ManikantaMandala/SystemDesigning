package com.lld.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lld.enums.SlotStatus;
import com.lld.enums.VehicleType;
import com.lld.model.Bill;
import com.lld.model.Operator;
import com.lld.model.PaymentVehicleRecord;
import com.lld.model.Slot;
import com.lld.model.VehicleSlotRecord;
import com.lld.repository.FloorRepository;
import com.lld.repository.GateRepository;
import com.lld.repository.OperatorRepository;
import com.lld.repository.VehicleSlotRecordRepository;
import com.lld.model.ParkingLotManager;
import com.lld.model.Payment;
import com.lld.strategy.allocation_strategy.AllocationStrategy;
import com.lld.strategy.amount_calculation_strategy.AmountCalculationStrategy;
import com.lld.strategy.payment_strategy.CashPaymentStrategy;
import com.lld.strategy.payment_strategy.PaymentStrategy;
import com.lld.strategy.payment_strategy.UpiPaymentStrategy;

public class ParkingLotService {

	GateRepository gateRepository;
	FloorRepository floorRepository;
	OperatorRepository operatorRepository;

	VehicleSlotRecordRepository vSlotRecordRepository;
	List<PaymentVehicleRecord> paymentVehicleRecords;

	AllocationStrategy allocationStrategy;
	AmountCalculationStrategy amountCalculationStrategy;
	PaymentStrategy paymentStrategy;
	ParkingLotManager parkingLotManager;

	public ParkingLotService(AllocationStrategy allocaitonStrategy,
			AmountCalculationStrategy amountCalculationStrategy) {
		gateRepository = GateRepository.getInstance();
		floorRepository = FloorRepository.getInstance();
		operatorRepository = OperatorRepository.getInstance();

		paymentVehicleRecords = new ArrayList<>();
		vSlotRecordRepository = new VehicleSlotRecordRepository();

		parkingLotManager = ParkingLotManager.getInstance(5, 20);
		parkingLotManager.fillValues();

		this.allocationStrategy = allocaitonStrategy;
		this.amountCalculationStrategy = amountCalculationStrategy;
	}

	public void vehicleEntry(String vehicleNumber, VehicleType type) {
		Slot slot = allocationStrategy.getAvailableSlot(vehicleNumber);
		slot.status = SlotStatus.OCCUPIED;

		VehicleSlotRecord record = new VehicleSlotRecord(vehicleNumber, slot);
		vSlotRecordRepository.addRecord(vehicleNumber, record);
	}

	public void vehicleExit(String vehicleNumber) {
		VehicleSlotRecord vSlotRecord = vSlotRecordRepository
				.getRecord(vehicleNumber);

		Slot occupiedSlot = vSlotRecord.getSlot();
		LocalDateTime entryTime = vSlotRecord.getEntryTime();
		LocalDateTime exitTime = LocalDateTime.now();

		double calculateAmount = amountCalculationStrategy.calculateAmount(
				occupiedSlot,
				entryTime,
				exitTime);

		Operator operator = floorRepository
				.getFloorByFloorNumber(occupiedSlot.floorNumber)
				.getExitGate()
				.getCurrentOperator();

		Bill currentBill = new Bill(
				entryTime,
				exitTime,
				vSlotRecord.getVehicleNumber(),
				occupiedSlot,
				calculateAmount,
				operator);

		System.out.println(currentBill.toString());

		System.out.println("Choose the payment strategy");
		System.out.println("1. CASH");
		System.out.println("2. ONLINE(UPI)");

		// TODO: InputService implementation
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		setPaymentStrategy(option);

		Payment payment = paymentStrategy.payAmount(currentBill);
		PaymentVehicleRecord record = new PaymentVehicleRecord(payment, vehicleNumber, currentBill);
		paymentVehicleRecords.add(record);

		occupiedSlot.status = SlotStatus.NOT_OCCUPIED;
		sc.close();
	}

	public PaymentStrategy setPaymentStrategy(int option) {
		if (option == 1) {
			return new CashPaymentStrategy();
		} else if (option == 2) {
			return new UpiPaymentStrategy();
		} else {
			System.out.println("Wrong option");

			return null;
		}
	}

}
