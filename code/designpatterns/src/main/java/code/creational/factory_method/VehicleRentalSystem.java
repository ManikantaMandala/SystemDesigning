package code.creational.factory_method;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import code.creational.factory_method.creator.BikeRental;
import code.creational.factory_method.creator.CarRental;
import code.creational.factory_method.creator.Rental;
import code.creational.factory_method.creator.TruckRental;
import code.creational.factory_method.entity.RentalRecord;

public class VehicleRentalSystem {
	static List<RentalRecord> records = new ArrayList<>();

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// other functionalities are not used
			String vehicleType = sc.nextLine();

			LocalDate startTime = LocalDate.now();
			LocalDate endTime = startTime.plusDays(2);

			addRentalRecord(vehicleType, startTime, endTime);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addRentalRecord(
			String vehicleType,
			LocalDate startTime,
			LocalDate endTime) {
		Rental rental;

		switch (vehicleType) {
			case "car":
				rental = new CarRental();
			case "bike":
				rental = new BikeRental();
				break;
			case "truck":
				rental = new TruckRental();
				break;
			default:
				throw new RuntimeException("Invalid type of Vehicle");
		}

		RentalRecord newRecord = rental
				.createRentalRecord(startTime, endTime, vehicleType);

		records.add(newRecord);
	}
}
