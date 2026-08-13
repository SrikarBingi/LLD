package Adapter;

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
