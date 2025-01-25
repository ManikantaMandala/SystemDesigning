package code.structural.adapter.externalAPI;

public class SBIPaymentAPI {

	public boolean makePayment(double amount) {
		System.out.printf("The %g is processed in bank SBI\n", amount);
		return true;
	}

	public String checkPaymentStatus(String transactionId) {
		if (transactionId.equalsIgnoreCase("failure")) {
			return "DENIED";
		}
		return "COMPLETED";
	}
}
