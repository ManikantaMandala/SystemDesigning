package code.abstract_factory.SmartHomeDeviceManagementSystem.factories;

import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.LGBulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.LGFreezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.LGTelevision;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.LGWashingMachine;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;

public class LGFactory implements AbstractFactory {

	@Override
	public Bulb createBulb() {
		return new LGBulb();
	}

	@Override
	public Freezer createFreezer() {
		return new LGFreezer();
	}

	@Override
	public Television createTelevision() {
		return new LGTelevision();
	}

	@Override
	public WashingMachine createWashingMachine() {
		return new LGWashingMachine();
	}

}
