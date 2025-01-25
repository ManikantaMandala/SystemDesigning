package code.structural.adapter.externalAPI;

public class ICICIPaymentAPI {

	public boolean processTransaction(double amount) {
		System.out.printf("The %g is processed in bank ICICI\n", amount);
		return true;
	}

	public String queryStatus(String transactionId) {
		if (transactionId.equalsIgnoreCase("failure")) {
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
