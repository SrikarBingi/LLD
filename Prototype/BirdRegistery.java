package Prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistery {

    private final Map<String, Bird> birds = new HashMap<>();

    public void registerBird(String type, Bird bird) {
        birds.put(type, bird);
    }

    public Bird getBird(String type) {

        Bird prototype = birds.get(type);

        if (prototype == null) {
            throw new IllegalArgumentException("Bird not found: " + type);
        }

        return prototype.cloneBird();
    }
}
