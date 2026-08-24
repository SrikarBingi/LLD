package CreationDP.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        NotificationCreator creator = new EmailCreator();

        creator.notifyUser();
    }
}
