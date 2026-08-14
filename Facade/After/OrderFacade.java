package Facade.After;

import Facade.Before.InventoryService;
import Facade.Before.NotificationService;
import Facade.Before.PaymentService;
import Facade.Before.ShippingSevice;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingSevice shippingService;
    private NotificationService notificationService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        shippingService = new ShippingSevice();
        notificationService = new NotificationService();
    }

    public void placeOrder() {

        if (!inventoryService.checkStock()) {
            System.out.println("Product out of stock");
            return;
        }

        paymentService.makePayment();
        shippingService.createShipment();
        notificationService.sendNotification();

        System.out.println("Order placed successfully");
    }
}
