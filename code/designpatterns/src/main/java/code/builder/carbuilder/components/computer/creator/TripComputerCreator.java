package code.builder.carbuilder.components.computer.creator;

import code.builder.carbuilder.components.computer.product.TripComputer;
import code.builder.carbuilder.components.computer.product.Computer;

public class TripComputerCreator implements ComputerCreator {

	@Override
	public Computer createComputer() {
		return new TripComputer();
	}

}
