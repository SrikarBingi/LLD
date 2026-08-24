package BehavioralDP.Strategy.After;

public class Client {
    public static void main(String[] args) {
        PathStrategy pathStrategy = new CarStrategy();
        
        GoogleMaps googleMaps = new GoogleMaps(pathStrategy);

        googleMaps.findPath("Dubbak", "Hyderabad");
    }
}
