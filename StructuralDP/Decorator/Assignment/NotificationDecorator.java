package StructuralDP.Decorator.Assignment;

public class NotificationDecorator extends PaymentDecorator{
    public NotificationDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {

        payment.pay(amount);

        System.out.println("SMS: Payment successful for ₹" + amount);
    }
}
