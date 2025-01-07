package code.factory_method.creator;

import code.factory_method.product.Truck;
import code.factory_method.product.Vehicle;

/**
 * Implementation of TruckRental
 */
public class TruckRental extends Rental {

	public Vehicle createVehicle() {
		return new Truck();
	}
}
