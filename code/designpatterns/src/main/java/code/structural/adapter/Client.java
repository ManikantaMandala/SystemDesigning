package code.structural.adapter;

import code.structural.adapter.adapter.Adapter;
import code.structural.adapter.adapter.ICICIAdapter;
import code.structural.adapter.adapter.KotakAdapter;
import code.structural.adapter.adapter.SBIAdapter;

public class Client {

    public static void main(String[] args) {

        Adapter sbiAdapter = new SBIAdapter();
        Adapter iciciAdapter = new ICICIAdapter();
        Adapter kotakAdapter = new KotakAdapter();

        double amount = 234.566;

        sbiAdapter.processPayment(amount);
        iciciAdapter.processPayment(amount);
        kotakAdapter.processPayment(amount);

        System.out.println(sbiAdapter.checkPaymentStatus("failure"));
        System.out.println(sbiAdapter.checkPaymentStatus("success"));
        System.out.println(sbiAdapter.checkPaymentStatus("anything-gives-success"));

        System.out.println(iciciAdapter.checkPaymentStatus("failure"));
        System.out.println(iciciAdapter.checkPaymentStatus("success"));
        System.out.println(iciciAdapter.checkPaymentStatus("anything-gives-success"));

        System.out.println(kotakAdapter.checkPaymentStatus("failure"));
        System.out.println(kotakAdapter.checkPaymentStatus("success"));
        System.out.println(kotakAdapter.checkPaymentStatus("anything-gives-success"));
    }
}
