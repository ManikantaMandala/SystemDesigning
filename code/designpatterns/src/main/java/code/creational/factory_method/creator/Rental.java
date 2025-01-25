package code.creational.factory_method.creator;

import java.time.LocalDate;

import code.creational.factory_method.entity.RentalRecord;
import code.creational.factory_method.product.Vehicle;

/**
 * abstract creator method
 */
public abstract class Rental {
	// Factory method
	public abstract Vehicle createVehicle();

	public RentalRecord createRentalRecord(LocalDate startTime,
			LocalDate endTime, String vehicleType) {

		Vehicle vehicle = createVehicle();
		return new RentalRecord(vehicle, startTime, endTime);
	}
}
