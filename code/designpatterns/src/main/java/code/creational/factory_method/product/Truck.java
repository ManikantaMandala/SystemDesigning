package code.creational.factory_method.product;

/**
 * Truck implementation
 */
public class Truck implements Vehicle {
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
		System.out.println("Starting the Truck vehicle");
	}

	@Override
	public void Stopping() {
		System.out.println("Stopping the Truck vehicle");
	}
}
