package code.factory_method.creator;

import code.factory_method.product.Car;
import code.factory_method.product.Vehicle;

/**
 * Implementation of CarRental
 */
public class CarRental extends Rental {

	public Vehicle createVehicle() {
		return new Car();
	}
}
