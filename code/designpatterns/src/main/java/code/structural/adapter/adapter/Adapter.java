package code.structural.adapter.adapter;

public interface Adapter {

    boolean processPayment(double amount);

    TransactionStatus checkPaymentStatus(String transactionId);
}
