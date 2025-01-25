package code.creational.builder.carbuilder.components.computer.creator;

import code.creational.builder.carbuilder.components.computer.product.Computer;
import code.creational.builder.carbuilder.components.computer.product.TripComputer;

public class TripComputerCreator implements ComputerCreator {

	@Override
	public Computer createComputer() {
		return new TripComputer();
	}

}
