package code.creational.factory_method.creator;

import code.creational.factory_method.product.Truck;
import code.creational.factory_method.product.Vehicle;

/**
 * Implementation of TruckRental
 */
public class TruckRental extends Rental {

	public Vehicle createVehicle() {
		return new Truck();
	}
}
