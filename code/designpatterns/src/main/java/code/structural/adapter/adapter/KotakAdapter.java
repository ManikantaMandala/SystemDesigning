package code.structural.adapter.adapter;

import code.structural.adapter.externalAPI.KotakPaymentAPI;

public class KotakAdapter implements Adapter {
    private KotakPaymentAPI kotakPaymentAPI;

    public KotakAdapter() {
        this.kotakPaymentAPI = new KotakPaymentAPI();
    }

    @Override
    public boolean processPayment(double amount) {
        return kotakPaymentAPI.initiateTransfer(amount);
    }

    @Override
    public TransactionStatus checkPaymentStatus(String transactionId) {
        String status = kotakPaymentAPI.trackStatus(transactionId);

        switch (status) {
            case "SUCCESS":
                return TransactionStatus.COMPLETED;

            case "DENIED":
                return TransactionStatus.DENIED;

            default:
                return TransactionStatus.PROCESSING;
        }
    }

}
