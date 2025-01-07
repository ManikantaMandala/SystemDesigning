package code.builder.carbuilder.builder;

import code.builder.carbuilder.components.Engine;
import code.builder.carbuilder.components.computer.creator.ComputerCreator;
import code.builder.carbuilder.components.computer.creator.GPSComputerCreator;
import code.builder.carbuilder.components.computer.creator.TripComputerCreator;
import code.builder.carbuilder.components.enums.ComputerType;
import code.builder.carbuilder.product.Car;

public class CarBuilder implements Builder {
	Car car;
	ComputerCreator computerCreator;

	public CarBuilder() {
		reset();
	}

	private void configureComputerCreator(ComputerType computerType) throws RuntimeException {
		switch (computerType) {
			case GPS:
				this.computerCreator = new GPSComputerCreator();
				break;

			case TRIP:
				this.computerCreator = new TripComputerCreator();
				break;

			default:
				throw new RuntimeException("wrong computer type");
		}
	}

	@Override
	public void reset() {
		this.car = new Car();
	}

	@Override
	public void setEngine(Engine engine) {
		this.car.setEngine(engine);
	}

	@Override
	public void setGPSComputer() {
		try {
			configureComputerCreator(ComputerType.GPS);
			this.car.setGpsComputer(computerCreator.createComputer());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void setSeat(int seatNumber) {
		this.car.setSeatNumber(seatNumber);
	}

	@Override
	public void setTripComputer() {
		try {
			configureComputerCreator(ComputerType.TRIP);
			this.car.setTripComputer(computerCreator.createComputer());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Car getProduct() {
		Car product = this.car;
		reset();
		return product;
	}

}
