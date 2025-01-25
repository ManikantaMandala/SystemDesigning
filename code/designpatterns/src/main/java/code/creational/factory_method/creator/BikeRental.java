package code.creational.factory_method.creator;

import code.creational.factory_method.product.Bike;
import code.creational.factory_method.product.Vehicle;

/**
 * Implementation of BikeRental
 */
public class BikeRental extends Rental {

	public Vehicle createVehicle() {
		return new Bike();
	}
}
