package Decorator.Assignment;

public class Client {
    public static void main(String[] args) {

        Payment payment = new RazorpayPayment();

        payment = new LoggingDecorator(payment);

        payment = new NotificationDecorator(payment);

        payment.pay(5000);
    }
}
