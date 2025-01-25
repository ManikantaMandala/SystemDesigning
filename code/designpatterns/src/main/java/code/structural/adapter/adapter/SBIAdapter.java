package code.structural.adapter.adapter;

import code.structural.adapter.externalAPI.SBIPaymentAPI;

public class SBIAdapter implements Adapter {
    private SBIPaymentAPI sbiPaymentAPI;

    public SBIAdapter() {
        this.sbiPaymentAPI = new SBIPaymentAPI();
    }

    @Override
    public boolean processPayment(double amount) {
        return sbiPaymentAPI.makePayment(amount);
    }

    @Override
    public TransactionStatus checkPaymentStatus(String transactionId) {
        String status = sbiPaymentAPI.checkPaymentStatus(transactionId);

        switch (status) {
            case "COMPLETED":
                return TransactionStatus.COMPLETED;

            case "DENIED":
                return TransactionStatus.DENIED;

            default:
                return TransactionStatus.PROCESSING;
        }
    }

}
