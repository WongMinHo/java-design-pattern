package com.minhow.prototype.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : MinHow
 */
public class ProtoTypeManager {
    private Map<String, Shape> ht = new HashMap<String, Shape>(2);

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }
    public Shape getShape(String key) {
        Shape shape = ht.get(key);

        return (Shape) shape.clone();
    }
}
