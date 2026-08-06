package Prototype.Assignment;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {

    private Map<String, Notebook> registry = new HashMap<>();

    public void addPrototype(String key, Notebook notebook) {
        registry.put(key, notebook);
    }

    public Notebook getClone(String key) {
        return registry.get(key).clone();
    }
    
}
