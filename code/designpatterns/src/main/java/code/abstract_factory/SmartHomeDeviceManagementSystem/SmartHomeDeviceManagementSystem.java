package code.abstract_factory.SmartHomeDeviceManagementSystem;

import java.util.Scanner;

import code.abstract_factory.SmartHomeDeviceManagementSystem.factories.AbstractFactory;
import code.abstract_factory.SmartHomeDeviceManagementSystem.factories.LGFactory;
import code.abstract_factory.SmartHomeDeviceManagementSystem.factories.SamsungFactory;
import code.abstract_factory.SmartHomeDeviceManagementSystem.factories.XiaomiFactory;

public class SmartHomeDeviceManagementSystem {
	public static Home createHome(String homeCompany) throws RuntimeException {
		AbstractFactory abFactory;

		switch (homeCompany) {
			case "lg":
				abFactory = new LGFactory();
				break;
			case "samsung":
				abFactory = new SamsungFactory();
				break;
			case "xiaomi":
				abFactory = new XiaomiFactory();
				break;
			default:
				throw new RuntimeException("Invalid company factory type");
		}

		return new Home(abFactory);
	}

	public static void main(String[] args) {

		String homeCompany;
		try (Scanner sc = new Scanner(System.in)) {

			homeCompany = sc.nextLine();

			Home home = createHome(homeCompany);

			home.television.onTelevision();
			home.bulb.lightsOn();
			home.freezer.On();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
