package com.lld.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.lld.model.Floor;

public class FloorRepository {

	private static FloorRepository instance;
	private List<Floor> floors;

	private FloorRepository() {
		floors = new ArrayList<>();
	}

	public static FloorRepository getInstance() {
		if (instance == null) {
			instance = new FloorRepository();
		}
		return instance;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void addFloor(Floor floor) {
		floors.add(floor);
	}

	public Floor getFloorByFloorNumber(int floorNumber) {
		int size = floors.size();

		for (int i = 0; i < size; i++) {
			Floor currFloor = floors.get(i);

			if (currFloor.getFloorNumber() == floorNumber) {
				return currFloor;
			}
		}

		return null;

	}

	public Floor getFloor(UUID floorId) {
		int size = floors.size();

		for (int i = 0; i < size; i++) {
			Floor currFloor = floors.get(i);

			if (currFloor.getId().equals(floorId)) {
				return currFloor;
			}
		}

		return null;

	}

}
