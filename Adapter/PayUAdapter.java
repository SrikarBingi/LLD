package Adapter;

import Adapter.PayU.PayU;

public class PayUAdapter implements PaymentProcessor{

    private PayU payU;

    public PayUAdapter(PayU payU){
        this.payU = payU;
    }

    @Override
    public void pay(double amount) {
        payU.processPayment(amount);
    }
    

}
