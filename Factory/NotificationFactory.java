package Factory;

public class NotificationFactory {

    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("email")){
            return new EmailNotification();
        }
        if(type.equalsIgnoreCase("sma")){
            return new SMSNotification();
        }
        return (Notification) new IllegalArgumentException("Invalid type");
    }

}
