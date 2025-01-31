package com.lld.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.lld.enums.GateType;
import com.lld.model.Gate;
import com.lld.model.Operator;

public class GateRepository {

	private static GateRepository instance;
	private List<Gate> gates;

	private GateRepository() {
		gates = new ArrayList<>();
	}

	public static GateRepository getInstance() {
		if (instance == null) {
			instance = new GateRepository();
		}
		return instance;
	}

	public void addGate(Gate gate) {
		gates.add(gate);
	}

	public Gate getGate(UUID gateId) {
		int size = gates.size();

		for (int i = 0; i < size; i++) {
			Gate currGate = gates.get(i);

			if (currGate.getId().equals(gateId)) {
				return currGate;
			}
		}

		return null;

	}

	public boolean updateGate(
			UUID gateId,
			GateType type,
			Operator currentOperator,
			int floorNumber) {

		int size = gates.size();

		for (int i = 0; i < size; i++) {
			Gate currGate = gates.get(i);

			if (currGate.getId().equals(gateId)) {
				currGate.setType(type);
				currGate.setCurrentOperator(currentOperator);
				currGate.setFloorNumber(floorNumber);

				return true;
			}
		}
		return false;
	}
}
