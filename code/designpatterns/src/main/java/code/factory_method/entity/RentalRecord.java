package code.factory_method.entity;

import java.time.Duration;
import java.time.LocalDate;

import code.factory_method.product.Vehicle;

public class RentalRecord {
	Vehicle vehicle;
	LocalDate startTime;
	LocalDate endTime;
	Double price;

	public RentalRecord(
			Vehicle vehicle,
			LocalDate startTime,
			LocalDate endTime) {

		this.vehicle = vehicle;
		this.startTime = startTime;
		this.endTime = endTime;
		calculatePrice();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void calculatePrice() {
		double price = vehicle.DisplayingCost()
				* Duration.between(startTime, endTime).toDays();
		setPrice(price);
	}
}
