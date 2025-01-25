package code.creational.builder.carbuilder.components.computer.creator;

import code.creational.builder.carbuilder.components.computer.product.Computer;
import code.creational.builder.carbuilder.components.computer.product.GPSComputer;

public class GPSComputerCreator implements ComputerCreator {

	@Override
	public Computer createComputer() {
		return new GPSComputer();
	}

}
