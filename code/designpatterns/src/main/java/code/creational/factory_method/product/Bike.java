package code.creational.factory_method.product;

/**
 * Bike implementation
 */
public class Bike implements Vehicle {
	double costPerDay = 499.00;

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public Double DisplayingCost() {
		return costPerDay;
	}

	@Override
	public void Starting() {
		System.out.println("Starting the Bike vehicle");
	}

	@Override
	public void Stopping() {
		System.out.println("Stopping the Bike vehicle");
	}
}
