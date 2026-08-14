package Decorator.Assignment;

public class LoggingDecorator extends PaymentDecorator{
    public LoggingDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {

        System.out.println("Logging: Payment started");

        payment.pay(amount);

        System.out.println("Logging: Payment completed");
    }
}
