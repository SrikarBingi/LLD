package BehavioralDP.Strategy.After;

public class BikeStrategy implements PathStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println(
                "Finding bicycle-friendly route from "
                + from + " to " + to
        );
    }

}
