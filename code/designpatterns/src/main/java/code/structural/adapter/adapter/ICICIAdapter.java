package code.structural.adapter.adapter;

import code.structural.adapter.externalAPI.ICICIPaymentAPI;

public class ICICIAdapter implements Adapter {
    private ICICIPaymentAPI iciciPaymentAPI;

    public ICICIAdapter() {
        this.iciciPaymentAPI = new ICICIPaymentAPI();
    }

    @Override
    public boolean processPayment(double amount) {
        return iciciPaymentAPI.processTransaction(amount);
    }

    @Override
    public TransactionStatus checkPaymentStatus(String transactionId) {
        String status = iciciPaymentAPI.queryStatus(transactionId);

        switch (status) {
            case "SUCCESS":
                return TransactionStatus.COMPLETED;

            case "FAILURE":
                return TransactionStatus.DENIED;

            default:
                return TransactionStatus.PROCESSING;
        }
    }

}
