package code.builder.carbuilder.components.computer.creator;

import code.builder.carbuilder.components.computer.product.GPSComputer;
import code.builder.carbuilder.components.computer.product.Computer;

public class GPSComputerCreator implements ComputerCreator {

	@Override
	public Computer createComputer() {
		return new GPSComputer();
	}

}
