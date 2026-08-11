package Factory;

public class Client {

    public static void main(String[] args) {
        
        Notification notification = NotificationFactory.createNotification("email");
        notification.send();
    }
}
