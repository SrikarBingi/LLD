package BehavioralDP.Strategy.Before;

public class Client {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();

        maps.findPath(
                "CAR",
                "Hyderabad",
                "Bangalore"
        );
    }
}
