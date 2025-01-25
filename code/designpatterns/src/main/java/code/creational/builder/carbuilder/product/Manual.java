package code.creational.builder.carbuilder.product;

import code.creational.builder.carbuilder.components.Engine;
import code.creational.builder.carbuilder.components.computer.product.Computer;

public class Manual {
	Engine engine;
	Computer gpsComputer;
	int seatNumber;
	Computer tripComputer;

	public Manual() {

	}

	public Manual(Engine engine, Computer gpsComputer, int seatNumber, Computer tripComputer) {
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

	@Override
	public String toString() {
		return gpsComputer != null
				? "Manual [engine=" + engine + ", gpsComputer=" + gpsComputer + ", seatNumber=" + seatNumber
						+ ", tripComputer=" + tripComputer + "]"
				: "Manual [engine=" + engine + ", seatNumber=" + seatNumber
						+ ", tripComputer=" + tripComputer + "]";
	}

	public void paint() {
		System.out.println(gpsComputer != null
				? "Manual [engine=" + engine + ", gpsComputer=" + gpsComputer + ", seatNumber=" + seatNumber
						+ ", tripComputer=" + tripComputer + "]"
				: "Manual [engine=" + engine + ", seatNumber=" + seatNumber
						+ ", tripComputer=" + tripComputer + "]");

	}
}
