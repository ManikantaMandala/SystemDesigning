package code.abstract_factory.SmartHomeDeviceManagementSystem.factories;

import code.abstract_factory.SmartHomeDeviceManagementSystem.products.bulb.Bulb;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.freezer.Freezer;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.television.Television;
import code.abstract_factory.SmartHomeDeviceManagementSystem.products.washingmachine.WashingMachine;

public interface AbstractFactory {
	Bulb createBulb();

	Freezer createFreezer();

	Television createTelevision();

	WashingMachine createWashingMachine();
}