package code.structural.adapter.externalAPI;

public class KotakPaymentAPI {

	public boolean initiateTransfer(double amount) {
		System.out.printf("The %g is processed in bank Kotak\n", amount);
		return true;
	}

	public String trackStatus(String transactionId) {
		if (transactionId.equalsIgnoreCase("failure")) {
			return "DENIED";
		}
		return "SUCCESS";
	}
}
