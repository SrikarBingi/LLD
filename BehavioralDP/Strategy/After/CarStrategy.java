package BehavioralDP.Strategy.After;

public class CarStrategy implements PathStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println(
                "Finding fastest car route from "
                + from + " to " + to
        );
    }

}
