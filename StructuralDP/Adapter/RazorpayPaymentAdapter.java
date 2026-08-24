package StructuralDP.Adapter;

import StructuralDP.Adapter.Razorpay.RazorpayPayment;

public class RazorpayPaymentAdapter implements PaymentProcessor{

    RazorpayPayment razorpayPayment;

    public RazorpayPaymentAdapter(RazorpayPayment razorpayPayment){
        this.razorpayPayment=razorpayPayment;
    }

    @Override
    public void pay(double amount) {
        razorpayPayment.makePayment(amount);
    }


}
