package code.creational.factory_method.creator;

import code.creational.factory_method.product.Car;
import code.creational.factory_method.product.Vehicle;

/**
 * Implementation of CarRental
 */
public class CarRental extends Rental {

	public Vehicle createVehicle() {
		return new Car();
	}
}
