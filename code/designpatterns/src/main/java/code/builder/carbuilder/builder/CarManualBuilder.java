package code.builder.carbuilder.builder;

import code.builder.carbuilder.components.Engine;
import code.builder.carbuilder.components.computer.creator.ComputerCreator;
import code.builder.carbuilder.components.computer.creator.GPSComputerCreator;
import code.builder.carbuilder.components.computer.creator.TripComputerCreator;
import code.builder.carbuilder.product.Manual;

public class CarManualBuilder implements Builder {
	Manual manual;
	ComputerCreator computerCreator;

	public CarManualBuilder() {
		reset();
	}

	private void configureComputerCreator(String computerType) throws RuntimeException {
		switch (computerType) {
			case "gps":
				computerCreator = new GPSComputerCreator();
				break;

			case "trip":
				this.computerCreator = new TripComputerCreator();
				break;

			default:
				throw new RuntimeException("wrong computer type");
		}
	}

	@Override
	public void reset() {
		this.manual = new Manual();
	}

	@Override
	public void setEngine(Engine engine) {
		this.manual.setEngine(engine);
	}

	@Override
	public void setGPSComputer() {
		try {
			configureComputerCreator("gps");
			this.manual.setGpsComputer(computerCreator.createComputer());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void setSeat(int seatNumber) {
		this.manual.setSeatNumber(seatNumber);
	}

	@Override
	public void setTripComputer() {
		try {
			configureComputerCreator("trip");
			this.manual.setTripComputer(computerCreator.createComputer());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public Manual getProduct() {
		Manual product = this.manual;
		reset();
		return product;
	}
}
