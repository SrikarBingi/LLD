package BehavioralDP.Strategy.Before;

public class GoogleMaps {
    public void findPath(String mode, String from, String to) {

        if (mode.equals("CAR")) {
            System.out.println("Finding route using car algorithm");
        }
        else if (mode.equals("WALK")) {
            System.out.println("Finding route using walking algorithm");
        }
        else if (mode.equals("BIKE")) {
            System.out.println("Finding route using bicycle algorithm");
        }
        else if (mode.equals("PUBLIC_TRANSPORT")) {
            System.out.println("Finding route using bus/train algorithm");
        }
    }
}
