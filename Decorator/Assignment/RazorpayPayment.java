package Decorator.Assignment;

public class RazorpayPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " using Razorpay");
    }
}
