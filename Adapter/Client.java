package Adapter;

public class Client {

    public static void main(String[] args) {
        
        RazorpayPayment razorpayPayment = new RazorpayPayment();

        PaymentProcessor paymentProcessor = new RazorpayPaymentAdapter(razorpayPayment);

        paymentProcessor.pay(1000);
    }
}
