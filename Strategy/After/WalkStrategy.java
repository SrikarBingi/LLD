package Strategy.After;

public class WalkStrategy implements PathStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println(
                "Finding walking route from "
                + from + " to " + to
        );
    }

}
