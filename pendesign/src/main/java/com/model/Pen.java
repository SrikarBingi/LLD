package com.model;

import com.strategy.WritingBehavior;

public abstract class Pen {
    private String brand;
    private String name;

    private WritingBehavior writingBehavior;

    public Pen(String brand, String name,
               WritingBehavior writingBehavior) {
        this.brand = brand;
        this.name = name;
        this.writingBehavior = writingBehavior;
    }

    public void write() {
        writingBehavior.write();
    }
}
