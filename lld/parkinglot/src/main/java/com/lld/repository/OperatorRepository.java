package com.lld.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.lld.model.Operator;

public class OperatorRepository {

	private static OperatorRepository instance;
	List<Operator> floors;

	private OperatorRepository() {
		floors = new ArrayList<>();
	}

	public static OperatorRepository getInstance() {
		if (instance == null) {
			instance = new OperatorRepository();
		}
		return instance;
	}

	public void addOperator(Operator operator) {
		floors.add(operator);
	}

	public Operator getOperator(UUID operatorId) {
		int size = floors.size();

		for (int i = 0; i < size; i++) {
			Operator currOperator = floors.get(i);

			if (currOperator.getId().equals(operatorId)) {
				return currOperator;
			}
		}

		return null;

	}

}
