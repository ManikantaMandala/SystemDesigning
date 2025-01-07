package code.builder.carbuilder.product;

import code.builder.carbuilder.components.Engine;
import code.builder.carbuilder.components.computer.product.Computer;

public class Car {
	Engine engine;
	Computer gpsComputer;
	int seatNumber;
	Computer tripComputer;

	public Car() {

	}

	public Car(Engine engine, Computer gpsComputer, int seatNumber, Computer tripComputer) {
		this.engine = engine;
		this.gpsComputer = gpsComputer;
		this.seatNumber = seatNumber;
		this.tripComputer = tripComputer;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Computer getGpsComputer() {
		return gpsComputer;
	}

	public void setGpsComputer(Computer gpsComputer) {
		this.gpsComputer = gpsComputer;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Computer getTripComputer() {
		return tripComputer;
	}

	public void setTripComputer(Computer tripComputer) {
		this.tripComputer = tripComputer;
	}

}
