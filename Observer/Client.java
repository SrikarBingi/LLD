package Observer;

public class Client {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        Observer srikar = new User("Srikar");
        Observer rahul = new User("Rahul");
        Observer anil = new User("Anil");

        channel.subscribe(srikar);
        channel.subscribe(rahul);
        channel.subscribe(anil);

        channel.uploadVideo("Observer Design Pattern");

        System.out.println();

        channel.unsubscribe(rahul);

        channel.uploadVideo("Strategy Design Pattern");
    }
}
