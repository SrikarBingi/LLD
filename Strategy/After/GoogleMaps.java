package Strategy.After;

import java.nio.file.Path;

public class GoogleMaps {

    private PathStrategy pathStrategy;

    public GoogleMaps(PathStrategy pathStrategy){
        this.pathStrategy = pathStrategy;
    }

    public void findPath(String from, String to){
        pathStrategy.findPath(from, to);
    }
}
