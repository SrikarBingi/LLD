package Facade.Before;

public class Client {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();
        PaymentService payment = new PaymentService();
        ShippingSevice shipping = new ShippingSevice();
        NotificationService notification = new NotificationService();

        if (inventory.checkStock()) {
            payment.makePayment();
            shipping.createShipment();
            notification.sendNotification();
        }
    }
}
